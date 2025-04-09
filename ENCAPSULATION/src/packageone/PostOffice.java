package packageone;

public class PostOffice {
    private String name;
    private String location;
    private int pinCode;
    private int employeesCount;
    private boolean isDigitalEnabled;

    // Public getters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getPinCode() { return pinCode; }
    public int getEmployeesCount() { return employeesCount; }
    public boolean isDigitalEnabled() { return isDigitalEnabled; }

    // Package-private setters
    void setName(String name) { this.name = name; }
    void setLocation(String location) { this.location = location; }
    void setPinCode(int pinCode) { this.pinCode = pinCode; }
    void setEmployeesCount(int employeesCount) { this.employeesCount = employeesCount; }
    void setDigitalEnabled(boolean isDigitalEnabled) { this.isDigitalEnabled = isDigitalEnabled; }
}
