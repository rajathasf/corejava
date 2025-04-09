package packagetwo;

import packageone.PostOffice;

public class PostOfficeViewer {
    public void displayPostOffice(PostOffice po) {
        System.out.println("Viewing PostOffice from different package:");
        System.out.println("Name: " + po.getName());
        System.out.println("Location: " + po.getLocation());
        System.out.println("Pin Code: " + po.getPinCode());
        System.out.println("Employees Count: " + po.getEmployeesCount());
        System.out.println("Digital Enabled: " + po.isDigitalEnabled());
    }
}
