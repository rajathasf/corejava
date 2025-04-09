package packagetwo;

import packageone.Apartment;

public class ApartmentViewer {
    public void displayApartment(Apartment apt) {
        System.out.println("Viewing Apartment from different package:");
        System.out.println("Name: " + apt.getApartmentName());
        System.out.println("Address: " + apt.getAddress());
        System.out.println("Floor: " + apt.getFloorNumber());
        System.out.println("Rent: ₹" + apt.getRent());
        System.out.println("Has Balcony: " + apt.isHasBalcony());
    }
}
