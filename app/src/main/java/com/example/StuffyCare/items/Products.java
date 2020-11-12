package com.example.StuffyCare.items;

public class Products {
    private String mName;
    private Integer mImage;

    public Products(){}
    public Products(String Name, Integer Image) {

        this.mName = Name;
        this.mImage = Image;
    }

    public void setName(String name) {
        this.mName= name;
    }
    public void setImage(Integer image) {
        this.mImage= image;
    }


    public String getName() {
        return mName;
    }
    public Integer getImage() {
        return mImage;
    }

}