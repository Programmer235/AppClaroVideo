package com.example.mx.com.myproject.appclarovideo.movieSection.dataAccess;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.mx.com.myproject.appclarovideo.common.pojo.Group;

import java.util.List;

public class MovieSecctionModel extends AndroidViewModel {

    private MovieSectionRepository movieSectionRepository;
    private LiveData<List<Group>> movie;


    public MovieSecctionModel(@NonNull Application application) {
        super(application);
        movieSectionRepository = new MovieSectionRepository();
        movie = movieSectionRepository.allMovieSection();
    }

    public LiveData<List<Group>> getMovie(){
        return movie;
    }
}
