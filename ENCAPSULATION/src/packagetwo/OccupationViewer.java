package packagetwo;

import packageone.Occupation;

public class OccupationViewer {
    public void viewOccupation(Occupation occupation) {
        System.out.println("Viewing Occupation from different package:");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Average Salary: $" + occupation.getAverageSalary());
        System.out.println("Requires Degree: " + occupation.isRequiresDegree());
        System.out.println("Work Location: " + occupation.getWorkLocation());
    }
}
