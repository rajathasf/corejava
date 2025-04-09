package packageone;

public class ApartmentManager {
    public void setupApartment(Apartment apt) {
        apt.setApartmentName("Skyline Residency");
        apt.setAddress("Koramangala, Bangalore");
        apt.setFloorNumber(5);
        apt.setRent(25000);
        apt.setHasBalcony(true);

        System.out.println("Apartment setup in same package:");
        System.out.println("Name: " + apt.getApartmentName());
        System.out.println("Address: " + apt.getAddress());
        System.out.println("Floor: " + apt.getFloorNumber());
        System.out.println("Rent: ₹" + apt.getRent());
        System.out.println("Has Balcony: " + apt.isHasBalcony());
    }
}
