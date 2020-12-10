package Model;

public class Transporter extends Vehicle {

    double weight;

    public Transporter() {
    }

    public Transporter(String brand, String model, double cubicCapacity, String fuelType, String color, double currentKilometer, String licensePlate, String category, String availableFrom, String availableUntil, boolean notAvailable, double weight) {
        super(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
