package chhaichivon.com.movies.ui.genre.api;

import chhaichivon.com.movies.base.retrofit.RetrofitManager;
import chhaichivon.com.movies.ui.genre.entity.ResponseGenre;
import chhaichivon.com.movies.utils.Common;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:12 AM
 */
public class GenreAPI {
    public interface GenreManager{
        //https://api.themoviedb.org/3/genre/movie/list?api_key=0e0698e20510523e4714467048549e01
        @GET("genre/movie/list?api_key="+ Common.API_KEY)
        Call<ResponseGenre> getMovieListGenre();
        //https://api.themoviedb.org/3/genre/tv/list?api_key=0e0698e20510523e4714467048549e01
        @GET("genre/movie/list?api_key="+ Common.API_KEY) Call<ResponseGenre> getTVListGenre();
        //https://api.themoviedb.org/3/genre/28/movies?api_key=0e0698e20510523e4714467048549e01
        @GET("genre/{genre}/movies?api_key="+ Common.API_KEY) Call<ResponseGenre> getGenreMovies(@Path("genre") int id);
        //https://api.themoviedb.org/3/genre/28/movies?api_key=0e0698e20510523e4714467048549e01&page=1
        @GET("genre/{genre}/movies?api_key="+ Common.API_KEY) Call<ResponseGenre> getGenreMoviesPage(@Path("genre") int id,@Query("page") int page);
        //https://api.themoviedb.org/3/genre/28/movies?api_key=0e0698e20510523e4714467048549e01&include_adult=true
        @GET("genre/{genre}/movies?api_key="+ Common.API_KEY) Call<ResponseGenre> getGenreMoviesWithAdult(@Path("genre") int id, @Query("include_adult") boolean isAdult);
        //https://api.themoviedb.org/3/genre/28/movies?api_key=0e0698e20510523e4714467048549e01&include_adult=true&sort_by=created_at.asc
        @GET("genre/{genre}/movies?api_key="+ Common.API_KEY) Call<ResponseGenre> getGenreMoviesWithAdultAndSort(@Path("genre") int id, @Query("include_adult") boolean isAdult,@Query("sort_by") String sort);
        //https://api.themoviedb.org/3/genre/28/movies?api_key=0e0698e20510523e4714467048549e01&include_adult=true&sort_by=created_at.asc&page=1
        @GET("genre/{genre}/movies?api_key="+ Common.API_KEY) Call<ResponseGenre> getGenreMoviesWithAdultAndSortPage(@Path("genre") int id, @Query("include_adult") boolean isAdult,@Query("sort_by") String sort,@Query("page") int page);
    }
    public static GenreManager getGenreManager(){
        return RetrofitManager.getAPIManager(Common.API_END_POINT).create(GenreManager.class);
    }

    public static String getImageURL(String size){
        return Common.IMG_URL + size ;
    }
}
