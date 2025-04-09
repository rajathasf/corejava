package packageone;

public class Occupation {
    private String title;
    private String industry;
    private double averageSalary;
    private boolean requiresDegree;
    private String workLocation;

    // Public getters
    public String getTitle() { return title; }
    public String getIndustry() { return industry; }
    public double getAverageSalary() { return averageSalary; }
    public boolean isRequiresDegree() { return requiresDegree; }
    public String getWorkLocation() { return workLocation; }

    // Package-private setters
    void setTitle(String title) { this.title = title; }
    void setIndustry(String industry) { this.industry = industry; }
    void setAverageSalary(double averageSalary) { this.averageSalary = averageSalary; }
    void setRequiresDegree(boolean requiresDegree) { this.requiresDegree = requiresDegree; }
    void setWorkLocation(String workLocation) { this.workLocation = workLocation; }
}
