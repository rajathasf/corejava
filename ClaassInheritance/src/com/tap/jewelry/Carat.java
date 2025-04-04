package com.tap.jewelry;

import com.tap.inherit.Gold;

public class Carat {
     String type;
     Gold gold;

    public Carat(String type, Gold gold) {
        this.type = type;
        this.gold = gold;
    }

    public String describeJewelry() {
        return "This is a " + gold.getCarat() + "-carat gold " + type + ".";
    }

    public static void main(String[] args) {
        Gold goldPiece = new Gold(22);
        Carat ring = new Carat("ring", goldPiece);
        System.out.println(ring.describeJewelry());
    }
}

