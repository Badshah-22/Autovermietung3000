package Model;

import DB.JSONDatabase;

public class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected String model;
    protected double cubicCapacity;
    protected String fuelType;
    protected String color;
    protected double currentKilometer;
    protected String licensePlate;
    protected String category;
    protected String availableFrom;
    protected String availableUntil;
    protected boolean notAvailable;

    private static int counter = JSONDatabase.getAllVehicleListSize();


    public Vehicle() {


    }

    public Vehicle(String brand, String model, double cubicCapacity, String fuelType, String color, double currentKilometer, String licensePlate, String category, String availableFrom, String availableUntil, boolean notAvailable) {
        this.vehicleId = counter++;
        this.brand = brand;
        this.model = model;
        this.cubicCapacity = cubicCapacity;
        this.fuelType = fuelType;
        this.color = color;
        this.currentKilometer = currentKilometer;
        this.licensePlate = licensePlate;
        this.category = category;
        this.availableFrom = availableFrom;
        this.availableUntil = availableUntil;
        this.notAvailable = notAvailable;
        this.vehicleId = counter++;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(double cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentKilometer() {
        return currentKilometer;
    }

    public void setCurrentKilometer(double currentKilometer) {
        this.currentKilometer = currentKilometer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(String availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getAvailableUntil() {
        return availableUntil;
    }

    public void setAvailableUntil(String availableUntil) {
        this.availableUntil = availableUntil;
    }

    public boolean isNotAvailable() {
        return notAvailable;
    }

    public void setNotAvailable(boolean notAvailable) {
        this.notAvailable = notAvailable;
    }

    public static void setCounter(int counter) {
        Vehicle.counter = counter;
    }


}

