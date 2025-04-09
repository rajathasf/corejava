package packageone;

import packagetwo.ApartmentViewer;

public class ApartmentMain {
    public static void main(String[] args) {
        Apartment apt = new Apartment();

        ApartmentManager manager = new ApartmentManager();
        manager.setupApartment(apt); // Uses setters and getters

        ApartmentViewer viewer = new ApartmentViewer();
        viewer.displayApartment(apt); // Uses only getters
    }
}
