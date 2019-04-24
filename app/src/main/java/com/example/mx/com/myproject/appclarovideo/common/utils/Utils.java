package com.example.mx.com.myproject.appclarovideo.common.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class Utils {

    /**
     * LOAD IMAGE GLIDE
     */
    public static void loadImage(Context context, ImageView imageView, String urlImg){
        RequestOptions options = new RequestOptions()
                .circleCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .fitCenter();

        Glide.with(context)
                .load(urlImg)
                .apply(options)
                .into(imageView);
    }
}
