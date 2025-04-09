package packageone;

public class OccupationManager {
    public void setupOccupation(Occupation occupation) {
        occupation.setTitle("Software Engineer");
        occupation.setIndustry("Technology");
        occupation.setAverageSalary(120000);
        occupation.setRequiresDegree(true);
        occupation.setWorkLocation("Remote");

        System.out.println("Occupation setup in same package:");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Average Salary: $" + occupation.getAverageSalary());
        System.out.println("Requires Degree: " + occupation.isRequiresDegree());
        System.out.println("Work Location: " + occupation.getWorkLocation());
    }
}
