package vide.steve.com.videoproject;

import android.app.Application;
import android.graphics.Typeface;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/21 18:00
 * 备注: (参考资料的链接等等)
 */

public class MyApllication extends Application{

    public Typeface typeFace;
    public static  MyApllication myApllication;

    @Override
    public void onCreate() {
        myApllication = this;
        super.onCreate();
    }


    public Typeface getTypeface() {
        if (typeFace != null) {
            return typeFace;
        } else {
            return Typeface.createFromAsset(getAssets(),
                    "fonts/fzkatong.otf");
        }
    }


}
