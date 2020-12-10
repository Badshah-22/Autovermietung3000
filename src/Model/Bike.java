package Model;

public class Bike extends Vehicle {



    float TankVolume;

    public Bike() {
    }

    public Bike(String brand, String model, double cubicCapacity, String fuelType, String color, double currentKilometer, String licensePlate, String category, String availableFrom, String availableUntil, boolean notAvailable, float tankVolume) {
        super(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable);
        TankVolume = tankVolume;
    }

    public float getTankVolume() {
        return TankVolume;
    }

    public void setTankVolume(float tankVolume) {
        TankVolume = tankVolume;
    }

}