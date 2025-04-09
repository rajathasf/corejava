package packageone;

public class GarageManager {
    public void setupGarage(Garage garage) {
        garage.setName("City Center Garage");
        garage.setLocation("MG Road, Bangalore");
        garage.setTotalCapacity(100);
        garage.setHasEVCharging(true);
        garage.setOpenHours("9 AM - 9 PM");

        System.out.println("Garage setup in same package:");
        System.out.println("Name: " + garage.getName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Total Capacity: " + garage.getTotalCapacity());
        System.out.println("Has EV Charging: " + garage.isHasEVCharging());
        System.out.println("Open Hours: " + garage.getOpenHours());
    }
}
