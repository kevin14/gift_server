package com.springapp.entity;

/**
 * Created by zhuoyangzong on 15/5/23.
 *
 * 保存页面查询条件
 */
public class Condition {

    private String keyWord;  // 关键字
    private int price;       // 价格
    private String category; // 分类
    private String region;   // 地区
    private String rate;     // 评价排序

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
