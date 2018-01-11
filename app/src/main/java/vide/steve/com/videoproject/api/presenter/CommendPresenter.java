package vide.steve.com.videoproject.api.presenter;

import android.content.Context;
import android.util.Log;
import java.util.List;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import vide.steve.com.videoproject.api.MVPPresenter;
import vide.steve.com.videoproject.api.MVPView;
import vide.steve.com.videoproject.api.RetrofitUtils;
import vide.steve.com.videoproject.api.bean.OverBean;
import vide.steve.com.videoproject.api.service.OverService;
import vide.steve.com.videoproject.api.view.CommendView;

/**
 * Created by admin on 2018/1/7.
 */

public class CommendPresenter implements MVPPresenter{

    public CommendView commendView;
    public Context mContext;

    public OverBean beans;

    public  CommendPresenter(Context context){
        mContext = context;
    }

    @Override
    public void onCreate(MVPView view) {
        this.commendView = (CommendView) view;
        Log.d("22222222222", "onNext: ");
    }


    public void getList(){
        Retrofit retrofit = RetrofitUtils.getRetrofit();
        OverService overService = retrofit.create(OverService.class);

        overService.getOverList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<OverBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("22222222222", "onSubscribe: ");
                    }

                    @Override
                    public void onNext(OverBean listResult) {


                        Log.d("3333333333333", "onNext: "+listResult.getData().getBookList().toString());
                        beans = listResult;
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("22222222222", "onError: "+e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.d("22222222222", "onComplete: ");
                        commendView.setData(beans);
                    }
                });




    }

}
