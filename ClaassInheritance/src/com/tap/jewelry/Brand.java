package com.tap.jewelry;

import com.tap.inherit.Cigratte;

public class Brand {
    private String type;
    private Cigratte Cigratte;

    public Brand(String type, Cigratte Cigratte) {
        this.type = type;
        this.Cigratte = Cigratte;
    }

    public String describe() {
        return "The cigarette brand " + Cigratte.name + " is of type " + type + ".";
    }

    public static void main(String[] args) {
        Cigratte marlboro = new Cigratte("Marlboro");
        Brand cigaretteType = new Brand("Classic", marlboro);
        System.out.println(cigaretteType.describe());
    }
}
