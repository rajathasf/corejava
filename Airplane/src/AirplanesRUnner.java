public class AirplanesRUnner {
    public static void main(String[] args) {
        Airline airline = new Airline("Air India", "AI302", "Delhi", "London", 200, 750.0, true, "Boeing 777", "Captain Roy", 10);
        System.out.println("Airline: " + airline.airlineName + " - Flight: " + airline.flightNumber);
    }
}
