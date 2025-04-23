package com.tap.jewelry;
import com.tap.inherit.Weather;

public class City {
    private String name;
    private Weather weather;

    public City(String name, Weather weather) {
        this.name = name;
        this.weather = weather;
    }

    public String describe() {
        return "The city of " + name + " has " + weather.getCondition() + " weather.";
    }

    public static void main(String[] args) {
        Weather sunnyWeather = new Weather("sunny");
        City bangalore = new City("Bangalore", sunnyWeather);
        System.out.println(bangalore.describe());
    }
}
