package vide.steve.com.videoproject.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import vide.steve.com.videoproject.MyApllication;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/21 18:07
 * 备注: (参考资料的链接等等)
 */

public class SyTextview extends TextView{


    public SyTextview(Context context) {
        super(context);
        init();
    }

    public SyTextview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SyTextview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public SyTextview(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        this.setTypeface(MyApllication.myApllication.getTypeface());
    }
}
