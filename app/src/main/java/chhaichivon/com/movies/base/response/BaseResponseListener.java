package chhaichivon.com.movies.base.response;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/12/2017
 * TIME   : 9:36 AM
 */
public interface BaseResponseListener<T> {
    void onSuccess(T data);
    void onError(String message);
    void onException(String message);
}
