package com.razerdp.widget.animatedpieview.data;

import android.support.annotation.ColorInt;

/**
 * Created by 大灯泡 on 2017/11/7.
 */

public interface GraphInfo {

    double getValue();

    @ColorInt
    int getColor();

    String getDesc();
}
