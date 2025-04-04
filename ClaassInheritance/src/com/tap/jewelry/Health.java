package com.tap.jewelry;

import com.tap.inherit.Kidney;

public class Health {
    private String condition;
    private Kidney kidney;

    public Health(String condition, Kidney kidney) {
        this.condition = condition;
        this.kidney = kidney;
    }

    public String describe() {
        return "The kidney " + kidney.name + " has a health condition: " + condition + ".";
    }

    public static void main(String[] args) {
        Kidney leftKidney = new Kidney("Left Kidney");
        Health kidneyHealth = new Health("Healthy", leftKidney);
        System.out.println(kidneyHealth.describe());
    }
}
