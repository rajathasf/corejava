package com.tap.jewelry;
import com.tap.inherit.Earbuds;

public class Color {
    private String shade;
    private Earbuds earbuds;

    public Color(String shade, Earbuds earbuds) {
        this.shade = shade;
        this.earbuds = earbuds;
    }

    public String describe() {
        return "The earbuds " + earbuds.name + " are of color " + shade + ".";
    }

    public static void main(String[] args) {
        Earbuds sonyEarbuds = new Earbuds("Sony 333333");
        Color earbudsColor = new Color("Black", sonyEarbuds);
        System.out.println(earbudsColor.describe());
    }
}