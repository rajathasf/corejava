package com.tap.jewelry;

import com.tap.inherit.Earth;

public class SolarSystem {
    private String type;
    private Earth earth;

    public SolarSystem(String type, Earth earth) {
        this.type = type;
        this.earth = earth;
    }

    public String describe() {
        return "The planet " + earth.getName() + " is part of the " + type + ".";
    }

    public static void main(String[] args) {
        Earth planetEarth = new Earth("Earth");
        SolarSystem solarSystem = new SolarSystem("Solar System", planetEarth);
        System.out.println(solarSystem.describe());
    }
}