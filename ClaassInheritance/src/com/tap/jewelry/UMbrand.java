package com.tap.jewelry;


import com.tap.inherit.Umbrella;

public class UMbrand {
    String type;
    Umbrella umbrella;

    public UMbrand(String type, Umbrella umbrella) {
        this.type = type;
        this.umbrella = umbrella;
    }

    public String describe() {
        return "The umbrella brand " + umbrella.name + " is of type " + type + ".";
    }

    public static void main(String[] args) {
        Umbrella sunUmbrella = new Umbrella("SunGuard");
        UMbrand umbrellaType = new UMbrand("Rain Protection", sunUmbrella);
        System.out.println(umbrellaType.describe());
    }
}
