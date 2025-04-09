package packageone;

import packagetwo.GarageViewer;

public class GarageMain {
    public static void main(String[] args) {
        Garage garage = new Garage();

        GarageManager manager = new GarageManager();
        manager.setupGarage(garage); // uses setters and getters

        GarageViewer viewer = new GarageViewer();
        viewer.displayGarage(garage); // uses only getters
    }
}
