package com.tap.jewelry;

import com.tap.inherit.Sweet;

public class TypeOfSweet {
    private String type;
    private Sweet sweet;

    public TypeOfSweet(String type, Sweet sweet) {
        this.type = type;
        this.sweet = sweet;
    }

    public String describe() {
        return "The sweet " + sweet.getName() + " is of type " + type + ".";
    }

    public static void main(String[] args) {
        Sweet gulabJamun = new Sweet("Gulab Jamun");
        TypeOfSweet dessert = new TypeOfSweet("dessert", gulabJamun);
        System.out.println(dessert.describe());
    }
}
