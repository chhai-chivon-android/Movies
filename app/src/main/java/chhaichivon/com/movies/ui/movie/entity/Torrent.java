package chhaichivon.com.movies.ui.movie.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:28 AM
 */
public class Torrent {
    @SerializedName("size_bytes")
    @Expose
    private String sizeBytes;

    @SerializedName("size")
    @Expose
    private String size;

    @SerializedName("seeds")
    @Expose
    private int seeds;

    @SerializedName("date_uploaded")
    @Expose
    private String dateUploaded;

    @SerializedName("peers")
    @Expose
    private int peers;

    @SerializedName("date_uploaded_unix")
    @Expose
    private String dateUploadedUnix;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("hash")
    @Expose
    private String hash;

    @SerializedName("quality")
    @Expose
    private String quality;
}
