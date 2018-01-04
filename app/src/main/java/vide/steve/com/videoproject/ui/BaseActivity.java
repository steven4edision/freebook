package vide.steve.com.videoproject.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import vide.steve.com.videoproject.MyApllication;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/18 16:47
 * 备注: (参考资料的链接等等)
 */

public abstract  class BaseActivity extends AppCompatActivity{


    protected MyApllication myApllication;
    public static Activity instanceActivity = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instanceActivity = this;
        myApllication = (MyApllication) getApplicationContext();
        MyApllication.unDestroyActivityList.add(this);

        setContentLayout();
        dealLogicBeforeInitView();
        initView();
        dealLogicAfterInitView();
    }


    /**
     * 设置布局文件
     */
    public abstract void setContentLayout();

    /**
     * 在实例化布局之前处理的逻辑
     */
    public abstract void dealLogicBeforeInitView();

    /**
     * 实例化布局文件/组件
     */
    public abstract void initView();

    /**
     * 在实例化布局之后处理的逻辑
     */
    public abstract void dealLogicAfterInitView();

    /**
     * 得到屏幕宽度
     *
     * @return 宽度
     */
    public int getScreenWidth() {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        return screenWidth;
    }

    /**
     * 得到屏幕高度
     *
     * @return 高度
     */
    public int getScreenHeight() {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenHeight = dm.heightPixels;
        return screenHeight;
    }



}
