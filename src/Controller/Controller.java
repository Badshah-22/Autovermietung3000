package Controller;

import DB.JSONDatabase;
import Model.Customer;
import Model.Rentalsystem;
import Model.Vehicle;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws IOException { //
        JSONDatabase.ReadSaveJSON();
        Vehicle.setCounter(JSONDatabase.getAllVehicleListSize());
        Customer.setCounter(JSONDatabase.getAllCustomersListSize());
        Rentalsystem.setCounter(JSONDatabase.getAllRentingsListSize());
        mainWindow();

    }

    public static void mainWindow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen zur Applikation: Autovermietung 3000"); // sout
        System.out.println("\t1. Fahrzeug erfassen");
        System.out.println("\t2. Fahrzeug ändern");
        System.out.println("\t3. Fahrzeuge suchen");
        System.out.println("\t4. Verfügbarkeit der Fahrzeuge");
        System.out.println("\t5. Vermietungen erfassen");
        System.out.println("\t6. Vermietungen ändern");
        System.out.println("\t7. Status der Vermietungen");
        System.out.println("\t8. Kunden erfassen");
        System.out.println("\te. Programm schliessen");


        String userChoice = scanner.nextLine();
        while (!userChoice.matches("[12345678Ee]")) {
            System.out.println("Das ist keine gültige Option");
            userChoice = scanner.nextLine();
        }
            switch (userChoice) {

                case "1":
                    CaptureVehicleController.captureVehicle();
                    break;

                case "2":
                    EditVehicleController.EditVehicle();
                    ;
                    break;

                case "3":
                    SearchVehicleController.searchVehicle();
                    break;

                case "4":
                    AvailableVehicleController.availableVehicle();
                    break;

                case "5":
                    CaptureRentalController.captureRental();
                    break;


                case "6":
                    EditRentalController.editRental();
                    break;

                case "7":
                    StatusRentalController.statusRental();
                    break;

                case "8":
                    CaptureCustomerController.captureCustomer();
                    break;


                case "e":
                    System.exit(0);
                    break;

            }
        }
    }




