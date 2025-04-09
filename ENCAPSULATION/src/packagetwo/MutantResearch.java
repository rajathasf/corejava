package packagetwo;

import packageone.Mutant;

public class MutantResearch {
    public void studyMutant(Mutant mutant) {
        System.out.println("Studied in different package:");
        System.out.println("Name: " + mutant.getName());
        System.out.println("Level: " + mutant.getLevel());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Is Dangerous: " + mutant.getIsDangerous());
        System.out.println("Origin: " + mutant.getOrigin());
    }
}
