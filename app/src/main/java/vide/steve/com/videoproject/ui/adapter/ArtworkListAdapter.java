package vide.steve.com.videoproject.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import vide.steve.com.videoproject.R;
import vide.steve.com.videoproject.api.bean.ArtWorkItemBean;

/**
 * 类名:
 * 作者: steven
 * 时间: 2017/12/20 17:32
 * 备注: (参考资料的链接等等)
 */

public class ArtworkListAdapter extends BaseQuickAdapter<ArtWorkItemBean,BaseViewHolder> {


    public ArtworkListAdapter(int layoutResId, @Nullable List<ArtWorkItemBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ArtWorkItemBean item) {
            helper.setText(R.id.activity_artwork_item_title,item.getTitle());
            helper.setText(R.id.activity_artwork_item_content,item.getContent());
    }
}
