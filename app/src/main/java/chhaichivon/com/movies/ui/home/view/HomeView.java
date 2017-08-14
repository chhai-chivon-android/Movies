package chhaichivon.com.movies.ui.home.view;

import chhaichivon.com.movies.base.response.BaseView;
import chhaichivon.com.movies.ui.movie.entity.ResponseMovie;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/13/17
 * TIME     : 12:30 PM
 */

public interface HomeView extends BaseView{
	void responseData(ResponseMovie movies);
}
