package com.example.mx.com.myproject.appclarovideo.movieInfo.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mx.com.myproject.appclarovideo.R;
import com.example.mx.com.myproject.appclarovideo.common.pojo.Common;
import com.example.mx.com.myproject.appclarovideo.common.utils.Constants;
import com.example.mx.com.myproject.appclarovideo.common.utils.Utils;
import com.example.mx.com.myproject.appclarovideo.movieInfo.dataAccess.MovieInfoModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class MovieInfoFragment extends DialogFragment {


    @BindView(R.id.img_movie)
    AppCompatImageView imgMovie;
    @BindView(R.id.title_movie)
    TextView titleMovie;
    @BindView(R.id.title_original_movie)
    TextView titleOriginalMovie;
    @BindView(R.id.year_movie)
    TextView yearMovie;
    @BindView(R.id.duration_movie)
    TextView durationMovie;
    @BindView(R.id.quality_movie)
    TextView qualityMovie;
    @BindView(R.id.description_movie)
    TextView descriptionMovie;
    @BindView(R.id.category_movie)
    TextView categoryMovie;
    Unbinder unbinder;
    @BindView(R.id.actor_movie)
    TextView actorMovie;
    @BindView(R.id.director_movie)
    TextView directorMovie;
    @BindView(R.id.writter_movie)
    TextView writterMovie;
    @BindView(R.id.productor_movie)
    TextView productorMovie;
    @BindView(R.id.progressbar)
    ProgressBar progressbar;

    private MovieInfoModel movieInfoModel;

    public MovieInfoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialog);
        if (getArguments() != null) {
            String group_id = getArguments().getString(Constants.GROUP_ID);
            movieInfoModel = ViewModelProviders.of(this).get(MovieInfoModel.class);
            movieInfoModel.getInfoMovie(group_id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_movie_info, container, false);
        unbinder = ButterKnife.bind(this, view);


        movieInfoModel.infoMovie.observe(getActivity(), new Observer<Common>() {
            @Override
            public void onChanged(@Nullable Common common) {
                progressbar.setVisibility(View.VISIBLE);
                Utils.loadImage(getActivity(), imgMovie, common.getImageMedium());
                titleMovie.setText(common.getTitle());
                titleOriginalMovie.setText(common.getExtendedcommon().getMedia().getOriginaltitle());
                yearMovie.setText(common.getExtendedcommon().getMedia().getPublishyear());
                durationMovie.setText(common.getExtendedcommon().getMedia().getDuration());
                qualityMovie.setText(common.getExtendedcommon().getMedia().getRating().getCode());
                descriptionMovie.setText("Descripción: " + common.getLargeDescription());

                String generes = "";
                String etiqueta = "";
                String talent = "";

                for (int i = 0; i < common.getExtendedcommon().getGenres().getGenre().size(); i++) {

                    if (i > 0) {
                        generes += ", " + common.getExtendedcommon().getGenres().getGenre().get(i).getDesc();
                    } else {
                        generes += common.getExtendedcommon().getGenres().getGenre().get(i).getDesc();
                    }

                }
                categoryMovie.setText("Género: " + generes);

                for (int j = 0; j < common.getExtendedcommon().getRoles().getRole().size(); j++) {
                    etiqueta = common.getExtendedcommon().getRoles().getRole().get(j).getName();
                    talent = "";
                    for (int i = 0; i < common.getExtendedcommon().getRoles().getRole().get(j).getTalents().getTalent().size(); i++) {

                        if (i > 0) {
                            talent += "  " + common.getExtendedcommon().getRoles().getRole().get(j).getTalents().getTalent().get(i).getFullname();
                        } else {
                            talent += common.getExtendedcommon().getRoles().getRole().get(j).getTalents().getTalent().get(i).getFullname();
                        }

                    }

                    switch (etiqueta) {
                        case "Actor":
                            actorMovie.setText("Actores: " + talent);
                            break;
                        case "Director":
                            directorMovie.setText("Director: " + talent);
                            break;
                        case "Writer":
                            writterMovie.setText("Escritor: " + talent);
                            break;
                        case "Producer":
                            productorMovie.setText("Productor: " + talent);
                            break;
                    }
                    progressbar.setVisibility(View.GONE);
                }

            }
        });
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.btn_back)
    public void onViewClicked() {
        getDialog().dismiss();
    }
}
