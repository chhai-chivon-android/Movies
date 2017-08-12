package chhaichivon.com.movies.ui.genre.adapter;

import android.widget.ImageView;
import android.databinding.BindingAdapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import chhaichivon.com.movies.ui.genre.api.GenreAPI;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:46 AM
 */
public class BindingImage {
    @BindingAdapter({"image"})
    public static void imageLoader(ImageView imageView, String url) {
        //How to replace the Glide
        Glide.with(imageView.getContext()).load(GenreAPI.getImageURL("w600")+url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .crossFade()
                .into(imageView);
    }
}
