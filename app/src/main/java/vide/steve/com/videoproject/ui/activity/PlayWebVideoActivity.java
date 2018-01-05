package vide.steve.com.videoproject.ui.activity;

import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
//import android.webkit.WebSettings;
//import android.webkit.WebView;
//import android.widget.Button;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import vide.steve.com.videoproject.R;

/**
 * 类名:
 * 作者: steven
 * 时间: 2018/1/3 10:39
 * 备注: (参考资料的链接等等)
 */

public class PlayWebVideoActivity extends AppCompatActivity {

    public WebView activity_play_webview;
    public WebSettings webSettings;


    public String mUrl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        setContentView(R.layout.activity_play_webview);
        activity_play_webview = findViewById(R.id.activity_play_webview);

       mUrl  =  getIntent().getExtras().getString("url");

       Log.e("555555555555",mUrl);

        webSettings = activity_play_webview.getSettings();
        webSettings.setUseWideViewPort(true);// 设置此属性，可任意比例缩放
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //关闭webview中缓存
        webSettings.setAllowFileAccess(true); //设置可以访问文件
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true); //支持通过JS打开新窗口
        webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
//        webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式
        webSettings.setSupportZoom(true);
        activity_play_webview.requestFocusFromTouch();
//        activity_play_webview.loadUrl("http://m.kankanwu.com/Sciencefiction/jiqizhixue/");
        activity_play_webview.loadUrl("http://www.kankanwu.com/Action/quanqiufengbao/");
//        activity_play_webview.loadUrl(mUrl);

        IX5WebViewExtension ix5 = activity_play_webview.getX5WebViewExtension();
        if (null != ix5) {
            ix5.setScrollBarFadingEnabled(false);
        }

//        activity_play_webview.evaluateJavascript("uaredirectformobile()", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//
//                Log.e("uaredirectformobile===",s);
//            }
//        });
//        activity_play_webview.evaluateJavascript("jquery-1.7.2.min()", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//                Log.e("jquery-1.7.2.min===",s);
//            }
//        });
//        activity_play_webview.evaluateJavascript("jquery-lazyload()", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//                Log.e("lazyload===",s);
//            }
//        });
//        activity_play_webview.evaluateJavascript("jquery.base()", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//                Log.e("jquery.base===",s);
//            }
//        });
//        activity_play_webview.evaluateJavascript("home()", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//                Log.e("home===",s);
//            }
//        });
//        activity_play_webview.evaluateJavascript("20X4()", new ValueCallback<String>() {
//            @Override
//            public void onReceiveValue(String s) {
//                Log.e("20X4===",s);
//            }
//        });
        activity_play_webview.evaluateJavascript("view_base()", new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String s) {
                Log.e("api_base===",s);
            }
        });


        WebViewClient webViewClient = new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                activity_play_webview.evaluateJavascript("view_base()", new ValueCallback<String>() {
                    @Override
                    public void onReceiveValue(String s) {
                        Log.e("api_base===",s);
                    }
                });

                return false;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                // TODO Auto-generated method stub
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                // TODO Auto-generated method stub
                super.onPageFinished(view, url);
            }

            @Override
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.proceed();
            }
        };


        activity_play_webview.setWebViewClient(webViewClient);

        activity_play_webview.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);

            }
        });

    }

}
