package packagetwo;

import packageone.Jet;

public class JetViewer {
    public void displayJet(Jet jet) {
        System.out.println("Viewing Jet from different package:");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Capacity: " + jet.getCapacity());
        System.out.println("Military Use: " + jet.isMilitary());
    }
}
