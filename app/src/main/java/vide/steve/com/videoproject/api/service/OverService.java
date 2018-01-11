package vide.steve.com.videoproject.api.service;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import vide.steve.com.videoproject.api.bean.OverBean;

/**
 * Created by admin on 2018/1/12.
 */

public interface OverService {


    @GET("top/man/top/over/week/1.html")
    Observable<OverBean> getOverList();

}
