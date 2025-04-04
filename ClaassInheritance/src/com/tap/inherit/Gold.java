package com.tap.inherit;

public class Gold {
    private int carat;

    public Gold(int carat) {
        this.carat = carat;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    public String describe() {
        return "This gold is " + carat + " carat.";
    }
}
