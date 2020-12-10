package DB;

import Model.*;

import java.util.List;

public class JSONObject {

    private List<Customer> allCustomersList;
    private List<Rentalsystem> allRentingsList;
    private List<Car> allCarsList;
    private List<Bike> allMotorcyclesList;
    private List<Transporter> allTransportersList;

    public JSONObject() {
    }

    public JSONObject(List<Customer> allCustomersList, List<Rentalsystem> allRentingsList, List<Car> allCarsList, List<Bike> allMotorcyclesList, List<Transporter> allTransportersList) {
        this.allCustomersList = allCustomersList;
        this.allRentingsList = allRentingsList;
        this.allCarsList = allCarsList;
        this.allMotorcyclesList = allMotorcyclesList;
        this.allTransportersList = allTransportersList;
    }

    public List<Customer> getAllCustomersList() {
        return allCustomersList;
    }

    public void setAllCustomersList(List<Customer> allCustomersList) {
        this.allCustomersList = allCustomersList;
    }

    public List<Rentalsystem> getAllRentingsList() {
        return allRentingsList;
    }

    public void setAllRentingsList(List<Rentalsystem> allRentingsList) {
        this.allRentingsList = allRentingsList;
    }

    public List<Car> getAllCarsList() {
        return allCarsList;
    }

    public void setAllCarsList(List<Car> allCarsList) {
        this.allCarsList = allCarsList;
    }

    public List<Bike> getAllMotorcyclesList() {
        return allMotorcyclesList;
    }

    public void setAllMotorcyclesList(List<Bike> allMotorcyclesList) {
        this.allMotorcyclesList = allMotorcyclesList;
    }

    public List<Transporter> getAllTransportersList() {
        return allTransportersList;
    }

    public void setAllTransportersList(List<Transporter> allTransportersList) {
        this.allTransportersList = allTransportersList;
    }
}
