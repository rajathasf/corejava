package packageone;

public class KeyChain {
    private String brand;
    private String material;
    private int keyCount;
    private boolean hasTracker;
    private String color;

    public String getBrand() { return brand; }
    public String getMaterial() { return material; }
    public int getKeyCount() { return keyCount; }
    public boolean isHasTracker() { return hasTracker; }
    public String getColor() { return color; }

    void setBrand(String brand) { this.brand = brand; }
    void setMaterial(String material) { this.material = material; }
    void setKeyCount(int keyCount) { this.keyCount = keyCount; }
    void setHasTracker(boolean hasTracker) { this.hasTracker = hasTracker; }
    void setColor(String color) { this.color = color; }
}
