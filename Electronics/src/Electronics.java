class Electronics {
    String brand;
    String model;
    String type;
    double price;
    boolean isSmart;
    int warrantyYears;
    String color;
    double weight;
    String connectivity;
    int batteryLife;

    Electronics() {
        this("Generic", "Basic");
    }
    Electronics(String brand, String model) {
        this(brand, model, "Unknown", 100.0);
    }
    Electronics(String brand, String model, String type, double price) {
        this(brand, model, type, price, true, 1);
    }
    Electronics(String brand, String model, String type, double price, boolean isSmart, int warrantyYears) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.isSmart = isSmart;
        this.warrantyYears = warrantyYears;
    }
    Electronics(String brand, String model, String type, double price, boolean isSmart, int warrantyYears, String color, double weight, String connectivity, int batteryLife) {
        this(brand, model, type, price, isSmart, warrantyYears);
        this.color = color;
        this.weight = weight;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
    }
}
