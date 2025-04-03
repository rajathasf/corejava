class Airline {
    String airlineName;
    String flightNumber;
    String origin;
    String destination;
    int capacity;
    double ticketPrice;
    boolean isInternational;
    String aircraftType;
    String pilotName;
    int flightDuration;


    Airline() {
        this("Unknown Airline", "0000");
    }


    Airline(String airlineName, String flightNumber) {
        this(airlineName, flightNumber, "Unknown", "Unknown", 100);
    }

    // Constructor 3
    Airline(String airlineName, String flightNumber, String origin, String destination, int capacity) {
        this(airlineName, flightNumber, origin, destination, capacity, 500.0, true);
    }
    Airline(String airlineName, String flightNumber, String origin, String destination, int capacity, double ticketPrice, boolean isInternational) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
    }

    Airline(String airlineName, String flightNumber, String origin, String destination, int capacity, double ticketPrice, boolean isInternational, String aircraftType, String pilotName, int flightDuration) {
        this(airlineName, flightNumber, origin, destination, capacity, ticketPrice, isInternational);
        this.aircraftType = aircraftType;
        this.pilotName = pilotName;
        this.flightDuration = flightDuration;
    }
}
