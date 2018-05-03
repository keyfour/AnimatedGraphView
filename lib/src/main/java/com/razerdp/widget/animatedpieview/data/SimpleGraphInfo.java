package com.razerdp.widget.animatedpieview.data;

/**
 * Created by 大灯泡 on 2017/11/7.
 */

public class SimpleGraphInfo implements GraphInfo {
    private double value;
    private int color;
    private String desc;

    public SimpleGraphInfo() {
    }

    public SimpleGraphInfo(double value, int color) {
        this(value, color, "");
    }

    public SimpleGraphInfo(double value, int color, String desc) {
        this.value = value;
        this.color = color;
        this.desc = desc;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
