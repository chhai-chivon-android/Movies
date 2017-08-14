package chhaichivon.com.movies.ui.home.api;

import chhaichivon.com.movies.base.retrofit.RetrofitManager;
import chhaichivon.com.movies.ui.movie.api.MovieAPI;
import chhaichivon.com.movies.ui.movie.entity.ResponseMovie;
import chhaichivon.com.movies.utils.Common;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/13/17
 * TIME     : 10:29 AM
 */

public class api {

	public interface MovieManager{
		@GET("movie/popular?api_key="+ Common.API_KEY)
		Call<ResponseMovie> getPopularity(@Query("page") int page);
	}

	public static MovieManager getMovieManager(){
		return RetrofitManager.getAPIManager(Common.API_END_POINT).create(MovieManager.class);
	}
}
