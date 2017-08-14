package chhaichivon.com.movies.ui.home.interactor;

import chhaichivon.com.movies.base.response.BaseResponseListener;
import chhaichivon.com.movies.ui.home.api.api;
import chhaichivon.com.movies.ui.movie.entity.ResponseMovie;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/13/17
 * TIME     : 12:29 PM
 */

public class HomeInteractorImpl implements HomeInteractor{
	private BaseResponseListener<ResponseMovie> responseMovieBaseResponseListener;
	public HomeInteractorImpl(BaseResponseListener<ResponseMovie> responseMovieBaseResponseListener){
		this.responseMovieBaseResponseListener = responseMovieBaseResponseListener;
	}
	@Override
	public void requestData(int page) {
		Call<ResponseMovie> call = api.getMovieManager().getPopularity(1);
		call.enqueue(new Callback<ResponseMovie>() {
			@Override
			public void onResponse(Call<ResponseMovie> call, Response<ResponseMovie> response) {
				if(!response.isSuccessful()) responseMovieBaseResponseListener.onException(response.errorBody().toString());
				ResponseMovie data = response.body();
				if(null == data) return;
				responseMovieBaseResponseListener.onSuccess(data);
			}
			@Override public void onFailure(Call<ResponseMovie> call, Throwable t) {
				responseMovieBaseResponseListener.onError(t.getLocalizedMessage());
			}
		});
	}
}
