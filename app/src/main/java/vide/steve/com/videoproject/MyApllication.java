package vide.steve.com.videoproject;

import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;

import com.tencent.smtt.sdk.QbSdk;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/21 18:00
 * 备注: (参考资料的链接等等)
 */

public class MyApllication extends Application{

    public Typeface typeFace;
    public static  MyApllication myApllication;
    public static List<Activity> unDestroyActivityList = new ArrayList<>();

    @Override
    public void onCreate() {
        myApllication = this;
        super.onCreate();
        QbSdk.initX5Environment(this,null);
    }


    public Typeface getTypeface() {
        if (typeFace != null) {
            return typeFace;
        } else {
            return Typeface.createFromAsset(getAssets(),
                    "fonts/fzkatong.otf");
        }
    }

    public void quit() {
        for (Activity activity : unDestroyActivityList) {
            if (null != activity) {
                activity.finish();
            }
        }
        unDestroyActivityList.clear();
    }



}
