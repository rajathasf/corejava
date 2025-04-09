package packageone;

public class KeyChainUser {
    public void setupKeyChain(KeyChain kc) {
        kc.setBrand("Titan");
        kc.setMaterial("Steel");
        kc.setKeyCount(3);
        kc.setHasTracker(true);
        kc.setColor("Silver");

        System.out.println("KeyChain setup in same package:");
        System.out.println("Brand: " + kc.getBrand());
        System.out.println("Material: " + kc.getMaterial());
        System.out.println("Key Count: " + kc.getKeyCount());
        System.out.println("Has Tracker: " + kc.isHasTracker());
        System.out.println("Color: " + kc.getColor());
    }
}

