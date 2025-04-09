package packagetwo;

import packageone.Gym;

public class GymViewer {
    public void displayGym(Gym gym) {
        System.out.println("Viewing Gym from different package:");
        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Trainers: " + gym.getNumberOfTrainers());
        System.out.println("24/7 Open: " + gym.isOpen24Hours());
        System.out.println("Monthly Fee: ₹" + gym.getMonthlyFee());
    }
}
