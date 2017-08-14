package chhaichivon.com.movies.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import chhaichivon.com.movies.ui.home.data.DataModel;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/13/17
 * TIME     : 11:49 AM
 */

public class MoviesAdapter extends BaseAdapter{

	private Context context;
	private LayoutInflater inflater = null;

	public MoviesAdapter(Context con, String[] list) {

		this.context = con;
		DataModel.movies = list;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public Object getItem(int i) {
		return null;
	}

	@Override
	public long getItemId(int i) {
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		return null;
	}

	public class ViewHolder {
		ImageView _cover;
		ImageView _background;
		TextView _movies;
		TextView _plot;
		TextView _releaseDate;
		View _vw_blayer;
	}
}
