package com.tap.jewelry;
import com.tap.inherit.Liver;

public class HHealth {
    private String condition;
    private Liver liver;

    public HHealth(String condition, Liver liver) {
        this.condition = condition;
        this.liver = liver;
    }

    public String describe() {
        return "The liver " + liver.name + " has a health condition: " + condition + ".";
    }

    public static void main(String[] args) {
        Liver humanLiver = new Liver("Human Liver");
        HHealth liverHealth = new HHealth("Healthy", humanLiver);
        System.out.println(liverHealth.describe());
    }
}
