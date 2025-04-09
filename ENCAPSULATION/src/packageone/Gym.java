package packageone;

public class Gym {
    private String name;
    private String location;
    private int numberOfTrainers;
    private boolean open24Hours;
    private double monthlyFee;

    // Public getters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getNumberOfTrainers() { return numberOfTrainers; }
    public boolean isOpen24Hours() { return open24Hours; }
    public double getMonthlyFee() { return monthlyFee; }

    // Package-private setters
    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setNumberOfTrainers(int numberOfTrainers) { this.numberOfTrainers = numberOfTrainers; }
    void setOpen24Hours(boolean open24Hours) { this.open24Hours = open24Hours; }
    void setMonthlyFee(double monthlyFee) { this.monthlyFee = monthlyFee; }
}
