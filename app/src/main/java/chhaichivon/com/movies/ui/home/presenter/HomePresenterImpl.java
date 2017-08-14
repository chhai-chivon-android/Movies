package chhaichivon.com.movies.ui.home.presenter;

import chhaichivon.com.movies.base.response.BaseResponseListener;
import chhaichivon.com.movies.ui.home.interactor.HomeInteractor;
import chhaichivon.com.movies.ui.home.interactor.HomeInteractorImpl;
import chhaichivon.com.movies.ui.home.view.HomeView;
import chhaichivon.com.movies.ui.movie.entity.ResponseMovie;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/13/17
 * TIME     : 12:28 PM
 */

public class HomePresenterImpl  implements HomePresenter , BaseResponseListener<ResponseMovie>{

	private HomeView  homeView;
	private HomeInteractor homeInteractor;

	public HomePresenterImpl(HomeView homeView){
		this.homeView = homeView;
		homeInteractor = new HomeInteractorImpl(this);
	}

	@Override
	public void requestData(int page) {
		homeInteractor.requestData(page);
	}

	@Override
	public void onSuccess(ResponseMovie data) {
		homeView.responseData(data);
	}

	@Override
	public void onError(String message) {
		homeView.showError(message);
	}

	@Override
	public void onException(String message) {
		homeView.showException(message);
	}
}
