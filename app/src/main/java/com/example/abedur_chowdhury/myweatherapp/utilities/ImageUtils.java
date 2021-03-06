package com.example.abedur_chowdhury.myweatherapp.utilities;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.abedur_chowdhury.myweatherapp.R;

public class ImageUtils {

  private ImageUtils() {
    throw new AssertionError();
  }

  public static void loadImage(ImageView imageView, String url) {
    Glide.with(imageView.getContext())
        .load(url)
            .error(android.R.drawable.ic_menu_close_clear_cancel)
            .placeholder(R.mipmap.ic_launcher)
        .into(imageView);
  }
}
