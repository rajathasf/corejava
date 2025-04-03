class SolarSystem {
    String star;
    int numberOfPlanets;
    boolean hasAsteroidBelt;
    double galaxyDistance;
    String planet1;
    String planet2;
    String planet3;
    int numberOfMoons;
    boolean hasLife;
    String galaxyName;


    SolarSystem() {
        this("Sun", 8);
    }

    SolarSystem(String star, int numberOfPlanets) {
        this(star, numberOfPlanets, true);
    }

    SolarSystem(String star, int numberOfPlanets, boolean hasAsteroidBelt) {
        this(star, numberOfPlanets, hasAsteroidBelt, "Milky Way", "Earth", "Mars", "Jupiter");
    }


    SolarSystem(String star, int numberOfPlanets, boolean hasAsteroidBelt, String galaxyName, String planet1, String planet2, String planet3) {
        this.star = star;
        this.numberOfPlanets = numberOfPlanets;
        this.hasAsteroidBelt = hasAsteroidBelt;
        this.galaxyName = galaxyName;
        this.planet1 = planet1;
        this.planet2 = planet2;
        this.planet3 = planet3;
    }

    SolarSystem(String star, int numberOfPlanets, boolean hasAsteroidBelt, double galaxyDistance, String galaxyName, String planet1, String planet2, String planet3, int numberOfMoons, boolean hasLife) {
        this(star, numberOfPlanets, hasAsteroidBelt, galaxyName, planet1, planet2, planet3);
        this.galaxyDistance = galaxyDistance;
        this.numberOfMoons = numberOfMoons;
        this.hasLife = hasLife;
    }
}
