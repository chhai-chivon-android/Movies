package chhaichivon.com.movies.app;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 8:08 AM
 */
public class App extends Application {
    private static Application application;
    @Override public void onCreate() {
        super.onCreate();
        application = this;

    }

    public static Application getInstance(){
        if (application == null) {
            synchronized (App.class) {
                if (application == null) {
                    application = new Application();
                }
            }
        }
        return application;
    }
    public static  boolean isNetworkAvailable(Context context) {
        if(context == null) { return false; }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
