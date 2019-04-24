package com.example.mx.com.myproject.appclarovideo.movieInfo.dataAccess;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import com.example.mx.com.myproject.appclarovideo.common.pojo.Common;

public class MovieInfoModel extends AndroidViewModel {

    public MovieInfoRepository movieInfoRepository;
    public LiveData<Common> infoMovie;


    public MovieInfoModel(@NonNull Application application) {
        super(application);
        movieInfoRepository = new MovieInfoRepository();
    }


    public void getInfoMovie(String group_id){
        infoMovie = movieInfoRepository.getInfoMovie(group_id);
    }


}
