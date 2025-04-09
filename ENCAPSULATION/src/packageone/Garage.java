package packageone;

public class Garage {
    private String name;
    private String location;
    private int totalCapacity;
    private boolean hasEVCharging;
    private String openHours;

    // Public getters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getTotalCapacity() { return totalCapacity; }
    public boolean isHasEVCharging() { return hasEVCharging; }
    public String getOpenHours() { return openHours; }

    // Package-private setters
    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setTotalCapacity(int totalCapacity) { this.totalCapacity = totalCapacity; }
    void setHasEVCharging(boolean hasEVCharging) { this.hasEVCharging = hasEVCharging; }
    void setOpenHours(String openHours) { this.openHours = openHours; }
}
