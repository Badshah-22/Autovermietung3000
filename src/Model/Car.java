package Model;

public class Car extends Vehicle {
    boolean NAV;
    double TrunkSpace;
    String Size;

    public Car() {
    }

    public Car(String brand, String model, double cubicCapacity, String fuelType, String color, double currentKilometer, String licensePlate, String category, String availableFrom, String availableUntil, boolean notAvailable, boolean NAV, double trunkSpace, String size) {
        super(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable);
        this.NAV = NAV;
        TrunkSpace = trunkSpace;
        Size = size;
    }

    public boolean isNAV() {
        return NAV;
    }

    public void setNAV(boolean NAV) {
        this.NAV = NAV;
    }

    public double getTrunkSpace() {
        return TrunkSpace;
    }

    public void setTrunkSpace(double trunkSpace) {
        TrunkSpace = trunkSpace;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
