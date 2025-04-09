package packagetwo;

import packageone.KeyChain;

public class KeyChainViewer {
    public void displayKeyChain(KeyChain kc) {
        System.out.println("Viewing KeyChain from different package:");
        System.out.println("Brand: " + kc.getBrand());
        System.out.println("Material: " + kc.getMaterial());
        System.out.println("Key Count: " + kc.getKeyCount());
        System.out.println("Has Tracker: " + kc.isHasTracker());
        System.out.println("Color: " + kc.getColor());
    }
}
