package chhaichivon.com.movies.ui.movie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import chhaichivon.com.movies.ui.film.fragment.FilmFragment;
import chhaichivon.com.movies.ui.genre.fragment.GenreFragment;
import chhaichivon.com.movies.ui.movie.fragment.MovieGridFragment;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 10:37 AM
 */
public class MainPagersAdapter extends FragmentPagerAdapter {

    public MainPagersAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MovieGridFragment();
        } else if (position == 1) {
            return new FilmFragment();
        } else {
            return new GenreFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Group";
        } else if (position == 1) {
            return "Search";
        } else {
            return "Next";
        }
    }
}