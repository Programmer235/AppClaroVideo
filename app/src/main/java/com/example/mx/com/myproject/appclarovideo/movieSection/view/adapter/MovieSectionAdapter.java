package com.example.mx.com.myproject.appclarovideo.movieSection.view.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.mx.com.myproject.appclarovideo.R;
import com.example.mx.com.myproject.appclarovideo.common.pojo.Group;
import com.example.mx.com.myproject.appclarovideo.common.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieSectionAdapter extends RecyclerView.Adapter<MovieSectionAdapter.ViewHolder> implements Filterable {


    private List<Group> listMovie;
    private List<Group> listMovieFilter;
    private OnItemClickListener listener;
    private Context context;
    private CustomFilter customFilter;

    public MovieSectionAdapter(Context context, List<Group> listMovie, OnItemClickListener listener) {
        this.context = context;
        this.listMovie = listMovie;
        this.listMovieFilter = new ArrayList<>();
        this.listener = listener;
        this.customFilter = new CustomFilter(MovieSectionAdapter.this);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_seccion_movie, viewGroup, false);
        //context = viewGroup.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        if(listMovie != null){
            Group movie = listMovieFilter.get(i); //listMovie.get(i);

            holder.setOnClickListener(movie.getId(),listener);

            holder.itemTitle.setText(movie.getTitle());
            Utils.loadImage(context, holder.itemImgMovie, movie.getImageBaseHorizontal());
        }

    }

    @Override
    public int getItemCount() {
        if(listMovieFilter != null){//listMovie != null){
            return  listMovieFilter.size();//listMovie.size();
        }else{
            return 0;
        }

    }

    public void setData(List<Group> allMovies) {
        if(allMovies != null){
            this.listMovie = allMovies;
            this.listMovieFilter.addAll(allMovies);
            notifyDataSetChanged();
        }
    }

    @Override
    public Filter getFilter() {
        return customFilter;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_img_movie)
        AppCompatImageView itemImgMovie;
        @BindView(R.id.item_title)
        TextView itemTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setOnClickListener(final String group_id, final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(group_id);
                }
            });
        }
    }

    public class CustomFilter extends Filter {
        private MovieSectionAdapter listAdapter;

        public CustomFilter(MovieSectionAdapter listAdapter) {
            this.listAdapter = listAdapter;
        }

        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            listMovieFilter.clear();
            final FilterResults results = new FilterResults();
            if(charSequence.length() == 0){
                listMovieFilter.addAll(listMovie);
            }else{
                final String filterPattern = charSequence.toString().toLowerCase().trim();
                for(final Group group:listMovie){
                    if (group.getTitle().toLowerCase().contains(filterPattern)){
                        listMovieFilter.add(group);
                    }
                }
            }
            results.values = listMovieFilter;
            results.count = listMovieFilter.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            this.listAdapter.notifyDataSetChanged();
        }
    }
}


