package chhaichivon.com.movies.ui.movie.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:26 AM
 */
public class Movie {
    @SerializedName("small_cover_image")
    @Expose
    private String smallCoverImage;

    @SerializedName("year")
    @Expose
    private int year;

    @SerializedName("directors")
    @Expose
    private List<String> directors;

    @SerializedName("date_uploaded")
    @Expose
    private String dateUploaded;

    @SerializedName("rating")
    @Expose
    private double rating;

    @SerializedName("runtime")
    @Expose
    private String runtime;

    @SerializedName("title_long")
    @Expose
    private String titleLong;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("synopsis")
    @Expose
    private String synopsis;

    @SerializedName("yt_trailer_code")
    @Expose
    private String ytTrailerCode;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("imdb_code")
    @Expose
    private String imdbCode;

    @SerializedName("background_image")
    @Expose
    private String backgroundImage;

    @SerializedName("cast")
    @Expose
    private List<String> cast;

    @SerializedName("google_video")
    @Expose
    private String googleVideo;

    @SerializedName("mpa_rating")
    @Expose
    private String mpaRating;

    @SerializedName("genres")
    @Expose
    private List<String> genres;

    @SerializedName("torrents")
    @Expose
    private List<Torrent> torrents;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("date_uploaded_unix")
    @Expose
    private int dateUploadedUnix;

    @SerializedName("slug")
    @Expose
    private String slug;

    @SerializedName("medium_cover_image")
    @Expose
    private String mediumCoverImage;

}
