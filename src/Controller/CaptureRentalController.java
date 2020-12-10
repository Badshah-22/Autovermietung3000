package Controller;



import DB.JSONDatabase;
import Model.Rentalsystem;

import java.io.IOException;
import java.util.Scanner;

public class CaptureRentalController {

    static int vehicleId;
    static  double price;
    static  float rentalPeriod;
    static String streetNumber;
    static  int postcode;
    static String placeOfDuration;
    static String status;
    static String telephone;
    static String email;
    static String DateOfBirth;

    private static boolean a = false;

    public static void captureRental() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Auto wollen Sie vermieten:");
        System.out.println("Fahrzeug ID / Marke / Model / Verfügbar?:");
        System.out.println("____________________________________:");

        for(int i = 0; i < JSONDatabase.getAllCarsList().size(); i++){
            System.out.println(JSONDatabase.getAllCarsList().get(i).getVehicleId() + "/" + JSONDatabase.getAllCarsList().get(i).getBrand() + "/" + JSONDatabase.getAllCarsList().get(i).getModel() + "/" + JSONDatabase.getAllCarsList().get(i).isNotAvailable());
        }
        for(int i = 0; i < JSONDatabase.getAllMotorcyclesList().size(); i++){
            System.out.println(JSONDatabase.getAllMotorcyclesList().get(i).getVehicleId() + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getBrand() + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getModel() + "/" + JSONDatabase.getAllMotorcyclesList().get(i).isNotAvailable());
        }
        for(int i = 0; i < JSONDatabase.getAllTransportersList().size(); i++){
            System.out.println(JSONDatabase.getAllTransportersList().get(i).getVehicleId() + "/" + JSONDatabase.getAllTransportersList().get(i).getBrand() + "/" + JSONDatabase.getAllTransportersList().get(i).getModel() + "/" + JSONDatabase.getAllTransportersList().get(i).isNotAvailable());
        }


        do {
            System.out.println("\tGeben Sie die gewünschte Fahrzeug ID ein");
            if (scanner.hasNextInt()) {
                vehicleId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);

        System.out.println("Preis:");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            } else {
                price = scanner.nextDouble();
                a = true;
            }
        } while (a == false);


        scanner.nextLine();

        System.out.println("Mietdauer:");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            } else {
                rentalPeriod = scanner.nextFloat();
                a = true;
            }
        } while (a == false);

        streetNumber = "";
        scanner.nextLine();
        while (streetNumber.equals("")) {
            System.out.println("Strasse und Nummer:");
            streetNumber = scanner.nextLine();
        }

        System.out.println("PLZ:");
        do {
            if (!scanner.hasNextInt()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            } else {
                price = scanner.nextInt();
                a = true;
            }
        } while (a == false);

        scanner.nextLine();

         placeOfDuration = "";
        while(placeOfDuration.equals("")) {
        System.out.println("Wohnort:");
        placeOfDuration = scanner.nextLine();
    }

        status = "";
        while(status.equals("")) {
            System.out.println("Status: [ offen | bezahlt | abgeschlossen ]");
            status = scanner.nextLine();
        }

        telephone = "";
        while(telephone.equals("")) {
            System.out.println("Telefon:");
            telephone = scanner.nextLine();
        }


        email = "";
        while(email.equals("")) {
            System.out.println("Email:");
            email = scanner.nextLine();
        }

        DateOfBirth = "";
        while(DateOfBirth.equals("")) {
            System.out.println("Geburtsdatum:");
            DateOfBirth = scanner.nextLine();
        }
        Rentalsystem rentalsystem = new Rentalsystem(vehicleId, price, rentalPeriod, streetNumber, postcode, placeOfDuration, status, telephone, email, DateOfBirth);
        try {
            JSONDatabase.addRentalsystem(rentalsystem);
        }catch(IOException e) {
        }
        Controller.mainWindow();

    }


}
