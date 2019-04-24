package com.example.mx.com.myproject.appclarovideo.movieSection.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.mx.com.myproject.appclarovideo.R;
import com.example.mx.com.myproject.appclarovideo.common.pojo.Group;
import com.example.mx.com.myproject.appclarovideo.common.utils.Constants;
import com.example.mx.com.myproject.appclarovideo.movieInfo.view.MovieInfoFragment;
import com.example.mx.com.myproject.appclarovideo.movieSection.dataAccess.MovieSecctionModel;
import com.example.mx.com.myproject.appclarovideo.movieSection.view.adapter.MovieSectionAdapter;
import com.example.mx.com.myproject.appclarovideo.movieSection.view.adapter.OnItemClickListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieSectionActivity extends AppCompatActivity implements OnItemClickListener {


    @BindView(R.id.recycler_view_movie)
    RecyclerView recyclerViewMovie;
    @BindView(R.id.content_movie_section)
    ConstraintLayout contentMovieSection;
    @BindView(R.id.search_movie)
    EditText searchMovie;


    private MovieSectionAdapter adapter;
    private MovieSecctionModel movieSecctionModel;
    private List<Group> allMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_section);
        ButterKnife.bind(this);
        getSupportActionBar().hide();

        movieSecctionModel = ViewModelProviders.of(this).get(MovieSecctionModel.class);
        configRecycleView();
        retrofitInit();

        searchMovie.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void configRecycleView() {
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(this,
                getResources().getInteger(R.integer.main_colums));
        recyclerViewMovie.setLayoutManager(linearLayoutManager);

        adapter = new MovieSectionAdapter(this, allMovies, this);
        recyclerViewMovie.setAdapter(adapter);
    }

    public void retrofitInit() {
        movieSecctionModel.getMovie().observe(this, new Observer<List<Group>>() {
            @Override
            public void onChanged(@Nullable List<Group> movies) {
                allMovies = movies;
                adapter.setData(allMovies);
            }
        });
    }

    @Override
    public void onItemClick(String group_id) {
        Bundle arguments = new Bundle();
        arguments.putString(Constants.GROUP_ID, group_id);

        MovieInfoFragment dialog = new MovieInfoFragment();
        dialog.setArguments(arguments);
        dialog.show(getSupportFragmentManager(), "MovieInfoFragment");
    }
}
