package chhaichivon.com.movies.ui.film.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:14 AM
 */
public class ResponseFilm {
    @SerializedName("genres")
    @Expose
    private List<Film> genres;

    public void setGenres(List<Film> genres){
        this.genres = genres;
    }

    public List<Film> getGenres(){
        return genres;
    }
}
