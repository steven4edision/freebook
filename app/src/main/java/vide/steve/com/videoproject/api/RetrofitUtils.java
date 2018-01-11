package vide.steve.com.videoproject.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 2018/1/12.
 */

public class RetrofitUtils {

    public static  Retrofit getRetrofit(){
//        return  new Retrofit.Builder()
//                .baseUrl("https://allapp.yphsy.com/")
//                .build();

       return new Retrofit.Builder()
                .baseUrl("https://allapp.yphsy.com/")
                .addConverterFactory(GsonConverterFactory.create())
                // 针对rxjava2.x
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    }

}
