package com.example.jungezai.fightring;

/**
 * Created by cfx on 2017/11/21.
 */

public class fight {
    private String name;
    private int imageId;
    public fight(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
