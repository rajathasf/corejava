package packageone;

import packagetwo.KeyChainViewer;

public class KeyChainMain {
    public static void main(String[] args) {
        KeyChain kc = new KeyChain();

        KeyChainUser user = new KeyChainUser();
        user.setupKeyChain(kc); // uses setters & getters

        KeyChainViewer viewer = new KeyChainViewer();
        viewer.displayKeyChain(kc); // uses only getters
    }
}

