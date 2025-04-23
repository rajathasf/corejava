package com.tap.jewelry;

import com.tap.inherit.Tickets;

public class Match {
    public static void main(String[] args) {
        int[] tempArray = {101, 3456};
        Tickets match1 = new Tickets(101, 3456, tempArray);

        match1.display();
    }
}
