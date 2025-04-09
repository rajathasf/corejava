package packageone;

import packagetwo.OccupationViewer;

public class OccupationMain {
    public static void main(String[] args) {
        Occupation occupation = new Occupation();

        OccupationManager manager = new OccupationManager();
        manager.setupOccupation(occupation); // uses setters and getters

        OccupationViewer viewer = new OccupationViewer();
        viewer.viewOccupation(occupation); // uses only getters
    }
}
