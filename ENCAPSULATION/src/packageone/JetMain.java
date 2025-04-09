package packageone;

import packagetwo.JetViewer;

public class JetMain {
    public static void main(String[] args) {
        Jet jet = new Jet();

        JetEngineer engineer = new JetEngineer();
        engineer.configureJet(jet); // uses setters and getters

        JetViewer viewer = new JetViewer();
        viewer.displayJet(jet); // uses only getters
    }
}
