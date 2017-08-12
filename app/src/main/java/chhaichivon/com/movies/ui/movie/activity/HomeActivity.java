package chhaichivon.com.movies.ui.movie.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import chhaichivon.com.movies.R;
import chhaichivon.com.movies.ui.movie.adapter.FragmentPagersAdapter;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.tablayout)
    TabLayout tab;
    @BindView(R.id.pager)
    ViewPager pager;
    private FragmentPagersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
