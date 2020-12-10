package DB;

import Controller.EditRentalController;
import Controller.EditVehicleController;
import Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JSONDatabase {
    private static String content = "";
    private static File json = new File("json.json");

    private static List<Customer> customersList = new ArrayList<>();
    private static List<Rentalsystem> rentingsList = new ArrayList<>();
    private static List<Car> allCarsList = new ArrayList<>();
    private static List<Bike> allMotorcyclesList = new ArrayList<>();
    private static List<Transporter> allTransportersList = new ArrayList<>();
    private static List<Vehicle> allVehiclesList = new ArrayList<>();


    public static void ReadSaveJSON() throws IOException {

        json.createNewFile();
        Scanner scanner = new Scanner(json);
        while (scanner.hasNextLine()) {
            content = scanner.nextLine();
        }

        if (!content.isEmpty()) {
            ObjectMapper objectMapper = new ObjectMapper();
            JSONObject JSONObject = objectMapper.readValue(content, JSONObject.class);
            customersList = JSONObject.getAllCustomersList();
            allCarsList = JSONObject.getAllCarsList();
            allMotorcyclesList = JSONObject.getAllMotorcyclesList();
            allTransportersList = JSONObject.getAllTransportersList();
            rentingsList = JSONObject.getAllRentingsList();
            allVehiclesList.addAll(allCarsList);
            allVehiclesList.addAll(allMotorcyclesList);
            allVehiclesList.addAll(allTransportersList);
        }
    }

    public static void UpdateVehicleList() throws IOException {
        JSONObject jsonObject = new JSONObject(customersList, rentingsList, allCarsList, allMotorcyclesList, allTransportersList);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(json, jsonObject);
    }

    public static int getAllVehicleListSize() {
        int size = allCarsList.size() + allMotorcyclesList.size() + allTransportersList.size();
        return size;
    }

    public static void addCar(Car car) throws IOException {
        allCarsList.add(car);
        UpdateVehicleList();
    }

    public static void addBike(Bike bike) throws IOException {
        allMotorcyclesList.add(bike);
        UpdateVehicleList();

    }

    public static void addTransport(Transporter transport) throws IOException {
        allTransportersList.add(transport);
        UpdateVehicleList();
    }

    public static void addCustomer(Customer customer) throws IOException {
        customersList.add(customer);
        UpdateVehicleList();


    }

    public static void addRentalsystem(Rentalsystem rentalsystem) throws IOException {
        rentingsList.add(rentalsystem);
        UpdateVehicleList();
    }

    public static int getAllCustomersListSize() {
        int size = customersList.size();
        return size;
    }

    public static int getAllRentingsListSize() {
        int size = rentingsList.size();
        return size;
    }

    public static List<Customer> getCustomersList() {
        return customersList;
    }

    public static List<Rentalsystem> getRentingsList() {
        return rentingsList;
    }

    public static List<Car> getAllCarsList() {
        return allCarsList;
    }

    public static List<Bike> getAllMotorcyclesList() {
        return allMotorcyclesList;
    }

    public static List<Transporter> getAllTransportersList() {
        return allTransportersList;
    }


    public static List<Customer> getAllCustomersList() {
        return getAllCustomersList();
    }

    public static List<Vehicle> getAllVehiclesList() {
        allVehiclesList.clear();
        allVehiclesList.addAll(allCarsList);
        allVehiclesList.addAll(allMotorcyclesList);
        allVehiclesList.addAll(allTransportersList);
        return allVehiclesList;
    }

    public static void changeStatus(int rentalId, String status) throws IOException {
        for (int i = 0; i < getRentingsList().size(); i++) {
            if (getRentingsList().get(i).getRentalId() == rentalId) {
                rentingsList.get(i).setStatus(status);
                UpdateVehicleList();
            }
        }
    }

    public static void showVehicle(int vehicleId) throws IOException {
        for (int i = 0; i < getAllVehiclesList().size(); i++) {
            if (getAllVehiclesList().get(i).getVehicleId() == vehicleId) {
                EditVehicleController.vehicle = getAllVehiclesList().get(i);
            }
        }
    }

    public static void showCar(int vehicleId) throws IOException {
        for (int i = 0; i < getAllCarsList().size(); i++) {
            if (getAllCarsList().get(i).getVehicleId() == vehicleId) {
                EditVehicleController.car = getAllCarsList().get(i);
            }
        }
    }

    public static void showBike(int vehicleId) throws IOException {
        for (int i = 0; i < getAllMotorcyclesList().size(); i++) {
            if (getAllMotorcyclesList().get(i).getVehicleId() == vehicleId) {
                EditVehicleController.bike = getAllMotorcyclesList().get(i);
            }
        }
    }

    public static void showTransport(int vehicleId) throws IOException {
        for (int i = 0; i < getAllTransportersList().size(); i++) {
            if (getAllTransportersList().get(i).getVehicleId() == vehicleId) {
                EditVehicleController.transport = getAllTransportersList().get(i);
            }
        }
    }

    public static void editBike(Bike bike, int vehicleId) throws  IOException {
        allMotorcyclesList.remove(EditVehicleController.bike);
        bike.setVehicleId(vehicleId);
        allMotorcyclesList.add(bike);
        UpdateVehicleList();
    }
    public static void editCar(Car car, int vehicleId) throws  IOException {
        allCarsList.remove(EditVehicleController.car);
        car.setVehicleId(vehicleId);
        allCarsList.add(car);
        UpdateVehicleList();
    }
    public static void editTransport(Transporter transport, int vehicleId) throws  IOException {
        allTransportersList.remove(EditVehicleController.transport);
        transport.setVehicleId(vehicleId);
        allTransportersList.add(transport);
        UpdateVehicleList();
    }


    public static void showRental(int rentalId) throws IOException {
        for (int i = 0; i < getRentingsList().size(); i++) {
            if (getRentingsList().get(i).getRentalId() == rentalId) {
                EditRentalController.rentalsystem = getRentingsList().get(i);
            }
        }
    }

    public static void editRentalsystem(Rentalsystem rentalsystem, int rentalId) throws IOException {
        rentingsList.remove(EditRentalController.rentalsystem);
        rentalsystem.setRentalId(rentalId);
        rentingsList.add(rentalsystem);
        UpdateVehicleList();
    }

    public static void checkAvailable(int vehicleId, boolean notAvailable) throws IOException {
        for (int i = 0; i < getAllVehiclesList().size(); i++) {
            if (getAllVehiclesList().get(i).getVehicleId() == vehicleId) {
                allVehiclesList.get(i).setNotAvailable(notAvailable);
                UpdateVehicleList();
            }
        }
    }
}