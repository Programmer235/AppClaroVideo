package com.example.mx.com.myproject.appclarovideo.retrofit;


import com.example.mx.com.myproject.appclarovideo.common.utils.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieApiClient {

    private static MovieApiClient INSTANCE = null;
    private MovieApiService movieApiService;
    private Retrofit retrofit;


    public MovieApiClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_URL_BASE)
                .addConverterFactory(GsonConverterFactory
                        .create()).build();

        movieApiService = retrofit.create(MovieApiService.class);
    }

    public static MovieApiClient  getInstance(){
        if(INSTANCE == null){
            INSTANCE = new MovieApiClient();
        }
        return INSTANCE;
    }

    public  MovieApiService getMovieSectionService(){
        return movieApiService;
    }

}
