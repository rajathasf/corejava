package com.tap.inherit;

import java.util.Arrays;

public class Tickets {
    int tick_id;
    int price;
    int[] temp;

    public Tickets(int tick_id, int price, int[] temp) {
        this.tick_id = tick_id;
        this.price = price;
        this.temp =temp;
    }
    public void display() {
        System.out.println("Ticket ID: " + tick_id);
        System.out.println("Price: " + price);
        System.out.println("Temp: " + Arrays.toString(temp));
    }
}
