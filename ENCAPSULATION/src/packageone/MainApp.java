package packageone;

import packagetwo.MutantResearch;

public class MainApp {
    public static void main(String[] args) {
        Mutant mutant = new Mutant();

        MutantLab lab = new MutantLab();
        lab.modifyMutant(mutant);  // Use setter and getter

        MutantResearch research = new MutantResearch();
        research.studyMutant(mutant);  // Use getter only
    }
}

