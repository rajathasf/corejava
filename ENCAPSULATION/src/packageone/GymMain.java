package packageone;

import packagetwo.GymViewer;

public class GymMain {
    public static void main(String[] args) {
        Gym gym = new Gym();

        GymManager manager = new GymManager();
        manager.setupGym(gym); // uses setters and getters

        GymViewer viewer = new GymViewer();
        viewer.displayGym(gym); // uses only getters
    }
}
