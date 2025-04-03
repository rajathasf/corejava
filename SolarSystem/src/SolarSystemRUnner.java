public class SolarSystemRUnner {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem("Sun", 8, true, 26000.0, "Milky Way", "Earth", "Mars", "Venus", 175, true);
        System.out.println("Solar System Star: " + solarSystem.star + " - Galaxy: " + solarSystem.galaxyName);
    }
}
