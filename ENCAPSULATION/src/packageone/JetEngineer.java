package packageone;

public class JetEngineer {
    public void configureJet(Jet jet) {
        jet.setModel("F-22 Raptor");
        jet.setManufacturer("Lockheed Martin");
        jet.setMaxSpeed(2410.0);
        jet.setCapacity(1);
        jet.setMilitary(true);

        System.out.println("Jet setup in same package:");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Capacity: " + jet.getCapacity());
        System.out.println("Military Use: " + jet.isMilitary());
    }
}
