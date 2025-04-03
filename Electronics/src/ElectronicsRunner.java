public class ElectronicsRunner{
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Samsung", "Galaxy S23", "Smartphone", 1200.0, true, 2, "Black", 0.5, "Wi-Fi, 5G", 24);
        System.out.println("Electronics Brand: " + electronics.brand + " - Model: " + electronics.model);
    }

}
