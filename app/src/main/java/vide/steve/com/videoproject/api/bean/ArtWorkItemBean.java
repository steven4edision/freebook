package vide.steve.com.videoproject.api.bean;

import java.io.Serializable;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/20 17:17
 * 备注: (参考资料的链接等等)
 */

public class ArtWorkItemBean implements Serializable{

    public String title;
    public String time;
    public String author_url;
    public String content;
    public String author;
    public String url;


    @Override
    public String toString() {
        return "ArtWorkItemBean{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", author_url='" + author_url + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
