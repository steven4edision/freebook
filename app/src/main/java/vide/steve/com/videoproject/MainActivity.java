package vide.steve.com.videoproject;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vide.steve.com.videoproject.api.bean.ArtWorkItemBean;
import vide.steve.com.videoproject.ui.adapter.ArtworkListAdapter;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recycleview;

    public List<ArtWorkItemBean> lists = new ArrayList<>();
    public MyHandler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleview = findViewById(R.id.recycleview);

        myHandler = new MyHandler();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Document document = Jsoup.connect("http://qxs.la/qihuan/").get();

//                    Elements elementsByClass = document.getElementsByClass("main list");
                    Elements elements_list = document.getElementsByClass("list_content ");
                    for (int i = 0; i < elements_list.size(); i++) {

                        ArtWorkItemBean bean = new ArtWorkItemBean();
                        Element element = elements_list.get(i);

                        Elements cc2 = element.getElementsByClass("cc2");
                        Elements select = cc2.select("[href]");
                        String href1 = select.attr("href");
                        String text = cc2.text();
                        bean.setTitle(text);
                        bean.setUrl(href1);
//                        map.put("title",text);
//                        map.put("url",href1);

                        Elements cc3 = element.getElementsByClass("cc3");
                        String text1 = cc3.text();
                        bean.setContent(text1);
//                        map.put("content",text1);

                        Elements cc4 = element.getElementsByClass("cc4");
                        Elements cc4_select = cc4.select("[href]");
                        String cc4_href = cc4_select.attr("href");
                        String author = cc4.text();
                        bean.setAuthor(author);
                        bean.setAuthor_url(cc4_href);
//                        map.put("author",author);
//                        map.put("author_url",cc4_href);

                        Elements cc5 = element.getElementsByClass("cc5");
                        String text3 = cc5.text();
                        bean.setTime(text3);
//                        map.put("time",text3);

                        lists.add(bean);
                    }

                    myHandler.sendEmptyMessage(1);

                    Log.v("666666666666666666=",elements_list.toString());
                    Log.v("666666666666666666=",lists.toString());


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public class  MyHandler extends Handler{
        public MyHandler(){

        }

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:

                    //接收到数据，然后进行适配
                    LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
                    manager.setOrientation(LinearLayoutManager.VERTICAL);
                    recycleview.setLayoutManager(manager);
                    ArtworkListAdapter adapter = new ArtworkListAdapter(R.layout.activity_artwork_list_item,lists);
                    recycleview.setAdapter(adapter);

                    break;
            }
        }
    }
//    var ss=["67.229.159.202","67.229.159.202","67.229.159.202"];
//var index = s % ss.length;
    public void getDownLoadLink(String prefix,String id,String name){
        String url = "http://" + "67.229.159.202" + "/full/" + prefix + "/" + id + ".txt";
    }
}
