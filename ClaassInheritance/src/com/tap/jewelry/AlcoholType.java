package com.tap.jewelry;

import com.tap.inherit.BlackAndWHite;

public class AlcoholType {
    private String type;
    private BlackAndWHite BlackAndWHite;

    public AlcoholType(String type, BlackAndWHite blackAndWhite) {
        this.type = type;
        this.BlackAndWHite = BlackAndWHite;
    }

    public String describe() {
        return "The alcohol brand " + BlackAndWHite.name + " is of type " + type + ".";
    }

    public static void main(String[] args) {
        BlackAndWHite whisky = new BlackAndWHite("Black & White");
        AlcoholType whiskeyType = new AlcoholType("Whisky", whisky);
        System.out.println(whiskeyType.describe());
    }
}

