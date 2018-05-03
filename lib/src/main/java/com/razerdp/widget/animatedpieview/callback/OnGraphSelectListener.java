package com.razerdp.widget.animatedpieview.callback;

import android.support.annotation.NonNull;

import com.razerdp.widget.animatedpieview.data.GraphInfo;

/**
 * Created by 大灯泡 on 2017/11/10.
 */

public interface OnGraphSelectListener<T extends GraphInfo> {
    /**
     * 选中的回调
     *
     * @param pieInfo   数据实体
     * @param isFloatUp 是否浮起
     */
    void onSelectPie(@NonNull T pieInfo, boolean isFloatUp);
}
