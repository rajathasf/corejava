package com.tap.jewelry;

import com.tap.inherit.Property;

public class Country {
    public static void main(String[] args) {
        String[] bids = {"RAJATH", "LOHIT"};
        Property property1 = new Property("JP nagar", 700000, bids);

        property1.display();
    }
}