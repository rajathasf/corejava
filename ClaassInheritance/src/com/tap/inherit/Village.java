package com.tap.inherit;

import java.util.Arrays;

public class Village {
    String name;
    int code;
    int[] PEOPLE;

    public Village(String name, int code, int[] PEOPLE) {
        this.name = name;
        this.code = code;
        this.PEOPLE=PEOPLE;
    }
    public void display() {
        System.out.println("name: " + name);
        System.out.println("code: " + code);
        System.out.println("PEOPLE: " + Arrays.toString(PEOPLE));
    }
}
