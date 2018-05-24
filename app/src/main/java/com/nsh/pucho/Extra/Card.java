package com.nsh.pucho.Extra;

/**
 * Created by ThisIsNSH on 5/24/2018.
 */

public class Card {
    public String name, img, function;

    public Card() {

    }

    public Card(String name, String img, String function) {
        this.name = name;
        this.img = img;
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getImg() {

        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
