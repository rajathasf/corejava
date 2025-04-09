package packagetwo;

import packageone.Tank;

public class TankViewer {
    public void viewTankDetails(Tank tank) {
        System.out.println("Viewing Tank from different package:");
        System.out.println("Name: " + tank.getName());
        System.out.println("Model: " + tank.getModel());
        System.out.println("Armor Thickness: " + tank.getArmorThickness() + " mm");
        System.out.println("Speed: " + tank.getSpeed() + " km/h");
        System.out.println("Operational: " + tank.isOperational());
    }
}
