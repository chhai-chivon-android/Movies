package chhaichivon.com.movies.ui.home.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import chhaichivon.com.movies.R;
import chhaichivon.com.movies.ui.home.presenter.HomePresenter;
import chhaichivon.com.movies.ui.home.presenter.HomePresenterImpl;
import chhaichivon.com.movies.ui.home.view.HomeView;
import chhaichivon.com.movies.ui.movie.entity.ResponseMovie;


public class HomeNavigationActivity extends AppCompatActivity implements HomeView{

	private TextView mTextMessage;

	private HomePresenter mHomePresenter;

	private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
			= new BottomNavigationView.OnNavigationItemSelectedListener() {

		@Override
		public boolean onNavigationItemSelected(@NonNull MenuItem item) {
			switch (item.getItemId()) {
				case R.id.navigation_home:
					mTextMessage.setText(R.string.title_home);
					return true;
				case R.id.navigation_movie:
					mTextMessage.setText(R.string.title_movie);
					return true;
				case R.id.navigation_genre:
					mTextMessage.setText(R.string.title_genre);
					return true;
				case R.id.navigation_film:
					mTextMessage.setText(R.string.title_film);
					return true;
			}
			return false;
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_navigation);
		getSupportActionBar().hide();

		mTextMessage = (TextView) findViewById(R.id.message);
		BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
		navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


		mHomePresenter = new HomePresenterImpl(this);
		mHomePresenter.requestData(1);
	}

	@Override
	public void showError(String message) {

	}

	@Override
	public void showException(String message) {

	}

	@Override
	public void responseData(ResponseMovie movies) {
		Log.d("DATA =", movies.getData().toString());
	}
}
