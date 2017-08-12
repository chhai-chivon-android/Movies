package chhaichivon.com.movies.ui.movie.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:28 AM
 */
public class Data {
    @SerializedName("movies")
    @Expose
    private List<Movie> movies;

    @SerializedName("page_number")
    @Expose
    private int pageNumber;

    @SerializedName("movie_count")
    @Expose
    private int movieCount;

    @SerializedName("limit")
    @Expose
    private int limit;
}
