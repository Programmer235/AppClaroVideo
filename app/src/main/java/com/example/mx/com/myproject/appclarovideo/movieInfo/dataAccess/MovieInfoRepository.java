package com.example.mx.com.myproject.appclarovideo.movieInfo.dataAccess;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.example.mx.com.myproject.appclarovideo.common.pojo.Common;
import com.example.mx.com.myproject.appclarovideo.common.pojo.ResposeInfoMovie;
import com.example.mx.com.myproject.appclarovideo.common.utils.Constants;
import com.example.mx.com.myproject.appclarovideo.retrofit.MovieApiClient;
import com.example.mx.com.myproject.appclarovideo.retrofit.MovieApiService;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieInfoRepository {


    private MovieApiService movieApiService;
    private MovieApiClient movieApiClient;
    private MutableLiveData<Common> movieInfo;


    public MovieInfoRepository() {
        movieApiClient = MovieApiClient.getInstance();
        movieApiService = movieApiClient.getMovieSectionService();
    }

    public MutableLiveData<Common> getInfoMovie(String group_id){

        if(movieInfo == null){
            movieInfo = new MutableLiveData<>();
        }

        movieApiService.getInfoMovie(Constants.DEVICE_ID,
                Constants.DEVICE_CATEGORY,
                Constants.DEVICE_MODEL,
                Constants.DEVICE_TYPE,
                Constants.FORMAT,
                Constants.DEVICE_MANUFACTURE,
                Constants.AUTH_PN,
                Constants.AUTH_PT,
                Constants.API_VERSION,
                Constants.REGION,
                Constants.HKS,
                group_id).enqueue(new Callback<ResposeInfoMovie>() {
            @Override
            public void onResponse(Call<ResposeInfoMovie> call, Response<ResposeInfoMovie> response) {
                if(response.isSuccessful()){
                    Log.e("LOG:", response.code()+"");
                    Log.e("LOG:", new Gson().toJson(response.body().getResponse().getGroup().getCommon()));
                    movieInfo.setValue(response.body().getResponse().getGroup().getCommon());
                }else{
                    Log.e("LOG:", "Ocurrio un error al obtener la información");
                }
            }

            @Override
            public void onFailure(Call<ResposeInfoMovie> call, Throwable t) {
                Log.e("LOG:", "ERROR:" + t.getMessage());
            }
        });

        return movieInfo;
    }
}
