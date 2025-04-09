package packageone;

public class Badge {
    private String title;
    private String level;
    private String awardedBy;
    private String issueDate;
    private boolean isActive;

    // Public getters
    public String getTitle() { return title; }
    public String getLevel() { return level; }
    public String getAwardedBy() { return awardedBy; }
    public String getIssueDate() { return issueDate; }
    public boolean isActive() { return isActive; }

    // Package-private setters
    void setTitle(String title) { this.title = title; }
    void setLevel(String level) { this.level = level; }
    void setAwardedBy(String awardedBy) { this.awardedBy = awardedBy; }
    void setIssueDate(String issueDate) { this.issueDate = issueDate; }
    void setIsActive(boolean isActive) { this.isActive = isActive; }
}
