package chhaichivon.com.movies.ui.movie.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chhaichivon.com.movies.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieGridFragment extends Fragment {


    public MovieGridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid_movie, container, false);
    }

}
