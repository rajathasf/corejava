package packagetwo;

import packageone.Garage;

public class GarageViewer {
    public void displayGarage(Garage garage) {
        System.out.println("Viewing Garage from different package:");
        System.out.println("Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Total Capacity: " + garage.getTotalCapacity());
        System.out.println("Has EV Charging: " + garage.isHasEVCharging());
        System.out.println("Open Hours: " + garage.getOpenHours());
    }
}
