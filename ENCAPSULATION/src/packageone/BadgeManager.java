package packageone;

public class BadgeManager {
    public void setupBadge(Badge badge) {
        badge.setTitle("Achievement Hunter");
        badge.setLevel("Platinum");
        badge.setAwardedBy("GameMaster Inc.");
        badge.setIssueDate("2025-04-01");
        badge.setIsActive(true);

        System.out.println("Badge setup in same package:");
        System.out.println("Title: " + badge.getTitle());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Awarded By: " + badge.getAwardedBy());
        System.out.println("Issue Date: " + badge.getIssueDate());
        System.out.println("Is Active: " + badge.isActive());
    }
}

