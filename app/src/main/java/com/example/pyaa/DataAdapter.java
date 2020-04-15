package com.example.pyaa;

public class DataAdapter {
    public String ShopImageUrl;
    public String ShopName;

    public String getShopImageUrl() {
        return ShopImageUrl;
    }
    public String getShopName(){
        return ShopName;
    }
    public void setShopImageUrl(String serverShopImageUrl){
        this.ShopImageUrl=serverShopImageUrl;
    }
    public void setShopName(String serverShopName){
        this.ShopName=serverShopName;
    }
}
