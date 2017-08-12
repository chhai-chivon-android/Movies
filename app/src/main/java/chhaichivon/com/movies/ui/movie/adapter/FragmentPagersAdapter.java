package chhaichivon.com.movies.ui.movie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import chhaichivon.com.movies.ui.movie.fragment.MovieGridFragment;
import chhaichivon.com.movies.ui.movie.fragment.MovieListFragment;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 10:48 AM
 */
public class FragmentPagersAdapter extends FragmentPagerAdapter {

    public FragmentPagersAdapter(FragmentManager fm){
        super(fm);
    }

    @Override public Fragment getItem(int position) {
        if(position == 0){
            return new MovieGridFragment();
        }else{
            return new MovieListFragment();
        }
    }

    @Override public int getCount() {
        return 2;
    }

    @Override public CharSequence getPageTitle(int position) {
        if(position == 0) return "Home";
        else return "Next";
    }
}
