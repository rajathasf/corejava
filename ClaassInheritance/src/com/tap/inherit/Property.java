package com.tap.inherit;

import java.util.Arrays;

public class Property {
    String area;
    int price;
    String[] bids;

    public Property(String area, int price, String[] bids) {
        this.area = area;
        this.price = price;
        this.bids=bids;
    }
    public void display() {
        System.out.println("name: " + area);
        System.out.println("code: " + price);
        System.out.println("PEOPLE: " + Arrays.toString(bids));
    }
}
