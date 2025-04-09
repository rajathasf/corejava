package packageone;

import packagetwo.PostOfficeViewer;

public class PostOfficeMain {
    public static void main(String[] args) {
        PostOffice po = new PostOffice();

        PostOfficeManager manager = new PostOfficeManager();
        manager.setupPostOffice(po); // uses setters and getters

        PostOfficeViewer viewer = new PostOfficeViewer();
        viewer.displayPostOffice(po); // uses only getters
    }
}
