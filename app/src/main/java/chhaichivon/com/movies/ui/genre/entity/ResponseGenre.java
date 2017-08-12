package chhaichivon.com.movies.ui.genre.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:14 AM
 */
public class ResponseGenre {
    @SerializedName("genres")
    @Expose
    private List<Genre> genres;

    public void setGenres(List<Genre> genres){
        this.genres = genres;
    }

    public List<Genre> getGenres(){
        return genres;
    }
}
