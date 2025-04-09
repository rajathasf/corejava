package packagetwo;

import packageone.Badge;

public class BadgeViewer {
    public void displayBadge(Badge badge) {
        System.out.println("Viewing Badge from different package:");
        System.out.println("Title: " + badge.getTitle());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Awarded By: " + badge.getAwardedBy());
        System.out.println("Issue Date: " + badge.getIssueDate());
        System.out.println("Is Active: " + badge.isActive());
    }
}
