package packageone;

public class TankOperator {
    public void prepareTank(Tank tank) {
        tank.setName("Leopard");
        tank.setModel("2A7");
        tank.setArmorThickness(120);
        tank.setSpeed(70);
        tank.setIsOperational(true);

        System.out.println("Tank setup in same package:");
        System.out.println("Name: " + tank.getName());
        System.out.println("Model: " + tank.getModel());
        System.out.println("Armor Thickness: " + tank.getArmorThickness() + " mm");
        System.out.println("Speed: " + tank.getSpeed() + " km/h");
        System.out.println("Operational: " + tank.isOperational());
    }
}
