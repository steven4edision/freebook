package vide.steve.com.videoproject.ui.activity;

import android.content.Intent;
import android.os.CountDownTimer;

import vide.steve.com.videoproject.MainActivity;
import vide.steve.com.videoproject.R;
import vide.steve.com.videoproject.ui.BaseActivity;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/26 13:52
 * 备注: (参考资料的链接等等)
 */

public class WelcomActivity extends BaseActivity{


    private CountDownTimer timer = new CountDownTimer(3000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(WelcomActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };


    @Override
    public void setContentLayout() {

        setContentView(R.layout.activity_welcom);
    }

    @Override
    public void dealLogicBeforeInitView() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void dealLogicAfterInitView() {

        timer.start();

    }
}
