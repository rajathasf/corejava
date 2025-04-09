package packageone;

public class Apartment {
    private String apartmentName;
    private String address;
    private int floorNumber;
    private double rent;
    private boolean hasBalcony;

    // Public getters
    public String getApartmentName() { return apartmentName; }
    public String getAddress() { return address; }
    public int getFloorNumber() { return floorNumber; }
    public double getRent() { return rent; }
    public boolean isHasBalcony() { return hasBalcony; }

    // Package-private setters
    void setApartmentName(String apartmentName) { this.apartmentName = apartmentName; }
    void setAddress(String address) { this.address = address; }
    void setFloorNumber(int floorNumber) { this.floorNumber = floorNumber; }
    void setRent(double rent) { this.rent = rent; }
    void setHasBalcony(boolean hasBalcony) { this.hasBalcony = hasBalcony; }
}
