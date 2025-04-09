package packageone;

public class PostOfficeManager {
    public void setupPostOffice(PostOffice po) {
        po.setName("Indira Nagar PO");
        po.setLocation("Bangalore");
        po.setPinCode(560038);
        po.setEmployeesCount(15);
        po.setDigitalEnabled(true);

        System.out.println("PostOffice setup in same package:");
        System.out.println("Name: " + po.getName());
        System.out.println("Location: " + po.getLocation());
        System.out.println("Pin Code: " + po.getPinCode());
        System.out.println("Employees Count: " + po.getEmployeesCount());
        System.out.println("Digital Enabled: " + po.isDigitalEnabled());
    }
}
