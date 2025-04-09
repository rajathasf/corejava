package packageone;

public class Tank {
    private String name;
    private String model;
    private int armorThickness;
    private int speed;
    private boolean isOperational;

    // Public getters
    public String getName() { return name; }
    public String getModel() { return model; }
    public int getArmorThickness() { return armorThickness; }
    public int getSpeed() { return speed; }
    public boolean isOperational() { return isOperational; }

    // Package-private setters (no modifier)
    void setName(String name) { this.name = name; }
    void setModel(String model) { this.model = model; }
    void setArmorThickness(int armorThickness) { this.armorThickness = armorThickness; }
    void setSpeed(int speed) { this.speed = speed; }
    void setIsOperational(boolean isOperational) { this.isOperational = isOperational; }
}
