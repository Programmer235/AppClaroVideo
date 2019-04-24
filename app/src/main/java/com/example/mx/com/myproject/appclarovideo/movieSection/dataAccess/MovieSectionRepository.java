package com.example.mx.com.myproject.appclarovideo.movieSection.dataAccess;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.example.mx.com.myproject.appclarovideo.common.pojo.Group;
import com.example.mx.com.myproject.appclarovideo.common.pojo.ResponseMovie;
import com.example.mx.com.myproject.appclarovideo.common.utils.Constants;
import com.example.mx.com.myproject.appclarovideo.retrofit.MovieApiClient;
import com.example.mx.com.myproject.appclarovideo.retrofit.MovieApiService;
import com.google.gson.Gson;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieSectionRepository {

    private MovieApiService movieApiService;
    private MovieApiClient movieApiClient;

    public MovieSectionRepository() {
        movieApiClient = MovieApiClient.getInstance();
        movieApiService = movieApiClient.getMovieSectionService();
    }

    public LiveData<List<Group>> allMovieSection(){
        final MutableLiveData<List<Group>> allMovieSeccion = new MutableLiveData<>();

        movieApiService.getSeccionMovie(
                Constants.API_VERSION,
                Constants.AUTH_PN,
                Constants.AUTH_PT,
                Constants.FORMAT,
                Constants.REGION,
                Constants.DEVICE_ID,
                Constants.DEVICE_CATEGORY,
                Constants.DEVICE_MODEL,
                Constants.DEVICE_TYPE,
                Constants.DEVICE_OS,
                Constants.DEVICE_MANUFACTURE,
                Constants.HKS,
                Constants.QUANTITY,
                Constants.ORDER_WAY,
                Constants.ORDER_ID,
                Constants.LEVEL_ID,
                Constants.FROM,
                Constants.NODE_ID).enqueue(new Callback<ResponseMovie>() {
            @Override
            public void onResponse(Call<ResponseMovie> call, Response<ResponseMovie> response) {
                if (response.isSuccessful()) {
                    allMovieSeccion.setValue(response.body().getResponse().getGroups());
                    Log.e("LOG:", "Success: " + new Gson().toJson(response.body().getResponse().getGroups()));
                } else {

                }
            }

            @Override
            public void onFailure(Call<ResponseMovie> call, Throwable t) {
                Log.e("LOG:", "Ocurrio un error: "+t.getMessage());
            }
        });

        return allMovieSeccion;
    }

}
