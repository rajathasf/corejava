package packageone;

public class GymManager {
    public void setupGym(Gym gym) {
        gym.setName("Iron Paradise");
        gym.setLocation("JP Nagar, Bangalore");
        gym.setNumberOfTrainers(8);
        gym.setOpen24Hours(true);
        gym.setMonthlyFee(1499.99);

        System.out.println("Gym setup in same package:");
        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Trainers: " + gym.getNumberOfTrainers());
        System.out.println("24/7 Open: " + gym.isOpen24Hours());
        System.out.println("Monthly Fee: ₹" + gym.getMonthlyFee());
    }
}
