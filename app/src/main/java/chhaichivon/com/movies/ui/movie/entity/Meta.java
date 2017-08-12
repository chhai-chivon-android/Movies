package chhaichivon.com.movies.ui.movie.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:29 AM
 */
public class Meta {
    @SerializedName("server_time")
    @Expose
    private int serverTime;

    @SerializedName("server_timezone")
    @Expose
    private String serverTimezone;

    @SerializedName("api_version")
    @Expose
    private int apiVersion;

    @SerializedName("execution_time")
    @Expose
    private String executionTime;
}
