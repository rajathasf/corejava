package packageone;

public class MutantLab {
    public void modifyMutant(Mutant mutant) {
        mutant.setName("Logan");
        mutant.setLevel(5);
        mutant.setPower("Regeneration");
        mutant.setIsDangerous(true);
        mutant.setOrigin("Canada");

        System.out.println("Modified in same package:");
        System.out.println("Name: " + mutant.getName());
        System.out.println("Level: " + mutant.getLevel());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Is Dangerous: " + mutant.getIsDangerous());
        System.out.println("Origin: " + mutant.getOrigin());
    }
}
