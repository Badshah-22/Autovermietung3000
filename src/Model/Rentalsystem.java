package Model;

import DB.JSONDatabase;

public class Rentalsystem {

    protected int rentalId;
    protected int vehicleId;
    double price;
    float rentalPeriod;
    String streetNumber;
    int postcode;
    String placeOfDuration;
    String status;
    String telephone;
    String Email;
    String DateOfBirth;


    private static int counter = JSONDatabase.getAllVehicleListSize();

    public Rentalsystem() {
    }

    public Rentalsystem(int vehicleId, double price, float rentalPeriod, String streetNumber, int postcode, String placeOfDuration, String status, String telephone, String email, String dateOfBirth) {
        this.rentalId = counter++;
        this.vehicleId = vehicleId;
        this.price = price;
        this.rentalPeriod = rentalPeriod;
        this.streetNumber = streetNumber;
        this.postcode = postcode;
        this.placeOfDuration = placeOfDuration;
        this.status = status;
        this.telephone = telephone;
        this.Email = email;
        this.DateOfBirth = dateOfBirth;
    }

    public int getRentalId() {
        return rentalId;
    }

    public static int getCounter() {

        return counter;
    }

    public void setRentalId(int rentalId) {

        this.rentalId = rentalId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public float getRentalPeriod() {

        return rentalPeriod;
    }

    public void setRentalPeriod(float rentalPeriod) {

        this.rentalPeriod = rentalPeriod;
    }

    public String getStreetNumber() {

        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {

        this.streetNumber = streetNumber;
    }

    public int getPostcode() {

        return postcode;
    }

    public void setPostcode(int postcode) {

        this.postcode = postcode;
    }

    public String getPlaceOfDuration() {

        return placeOfDuration;
    }

    public void setPlaceOfDuration(String placeOfDuration) {

        this.placeOfDuration = placeOfDuration;
    }

    public String getStatus() {

        return status;
    }




    public void setStatus(String status) {

        this.status = status;
    }

    public String getTelephone() {

        return telephone;
    }

    public void setTelephone(String telephone) {

        this.telephone = telephone;
    }

    public String getEmail() {

        return Email;
    }

    public void setEmail(String email) {

        Email = email;
    }

    public String getDateOfBirth() {

        return DateOfBirth;
    }


    public void setDateOfBirth(String dateOfBirth) {

        DateOfBirth = dateOfBirth;
    }

    public static void setCounter(int counter) {

        Rentalsystem.counter = counter;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {

        this.vehicleId = vehicleId;
    }
}





