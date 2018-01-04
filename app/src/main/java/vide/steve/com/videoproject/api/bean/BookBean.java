package vide.steve.com.videoproject.api.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/27 12:59
 * 备注: (参考资料的链接等等)
 */
@Entity
public class BookBean {

    @Id
    private long id;//作品的唯一标识id
    private String name;//作品名
    private String authorname;//作者名字
    private String synopsis;//简介
    private String lastupdatetime;//最后更新时间
    private String lastchapter;//最后更新的章节
    private String imgurl;//书籍的封面url
    private String authorurl;//作者的链接
    private String bookurl;//书籍的链接
    private String authorheaderurl;//作者头像
    private String authorinfo;
    @Generated(hash = 1997506957)
    public BookBean(long id, String name, String authorname, String synopsis,
            String lastupdatetime, String lastchapter, String imgurl,
            String authorurl, String bookurl, String authorheaderurl,
            String authorinfo) {
        this.id = id;
        this.name = name;
        this.authorname = authorname;
        this.synopsis = synopsis;
        this.lastupdatetime = lastupdatetime;
        this.lastchapter = lastchapter;
        this.imgurl = imgurl;
        this.authorurl = authorurl;
        this.bookurl = bookurl;
        this.authorheaderurl = authorheaderurl;
        this.authorinfo = authorinfo;
    }
    @Generated(hash = 269018259)
    public BookBean() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthorname() {
        return this.authorname;
    }
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
    public String getSynopsis() {
        return this.synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public String getLastupdatetime() {
        return this.lastupdatetime;
    }
    public void setLastupdatetime(String lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
    public String getLastchapter() {
        return this.lastchapter;
    }
    public void setLastchapter(String lastchapter) {
        this.lastchapter = lastchapter;
    }
    public String getImgurl() {
        return this.imgurl;
    }
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    public String getAuthorurl() {
        return this.authorurl;
    }
    public void setAuthorurl(String authorurl) {
        this.authorurl = authorurl;
    }
    public String getBookurl() {
        return this.bookurl;
    }
    public void setBookurl(String bookurl) {
        this.bookurl = bookurl;
    }
    public String getAuthorheaderurl() {
        return this.authorheaderurl;
    }
    public void setAuthorheaderurl(String authorheaderurl) {
        this.authorheaderurl = authorheaderurl;
    }
    public String getAuthorinfo() {
        return this.authorinfo;
    }
    public void setAuthorinfo(String authorinfo) {
        this.authorinfo = authorinfo;
    }
}
