package packageone;

import packagetwo.BadgeViewer;

public class BadgeMain {
    public static void main(String[] args) {
        Badge badge = new Badge();

        BadgeManager manager = new BadgeManager();
        manager.setupBadge(badge); // uses setters and getters

        BadgeViewer viewer = new BadgeViewer();
        viewer.displayBadge(badge); // uses only getters
    }
}
