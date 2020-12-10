package Controller;
import DB.JSONDatabase;
import Model.Rentalsystem;
import Model.Vehicle;

import java.io.IOException;
import java.util.Scanner;

public class EditRentalController {


    public static Rentalsystem rentalsystem;
    static int vehicleId;
    static int rentalId;
    static double price;
    static float rentalPeriod;
    static String streetNumber;
    static int postcode;
    static String placeOfDuration;
    static String status;
    static String telephone;
    static String email;
    static String DateOfBirth;

    private static boolean a = false;


    public static void editRental() {

        System.out.println("Welche Vermietung wollen Sie ändern:");

        System.out.println("Vermietungs ID / Fahrzeug ID / Preis / Status:");
        System.out.println("____________________________________:");

        for (int i = 0; i < JSONDatabase.getRentingsList().size(); i++) {
            System.out.println(JSONDatabase.getRentingsList().get(i).getRentalId() + "/" + JSONDatabase.getRentingsList().get(i).getVehicleId() + "/" + JSONDatabase.getRentingsList().get(i).getPrice() + "/" + JSONDatabase.getRentingsList().get(i).getStatus());
        }

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\tWählen Sie eine Vermietungs ID aus");
            if (scanner.hasNextInt()) {
                rentalId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);

        try {
            JSONDatabase.showRental(rentalId);
        }catch(IOException e) {
        }

        System.out.println("Wollen Sie die Fahrzeug ID ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int vehicleIdChoice = scanner.nextInt();
        switch (vehicleIdChoice) {
            case 1:
                do {
                    System.out.println("\tFahrzeug ID");
                    if (scanner.hasNextInt()) {
                        vehicleId = scanner.nextInt();
                        a = true;
                    }else {
                        System.out.println("Die Eingabe war leider ungültig.");
                        a = false;
                        scanner.next();
                    }
                }while(a == false);
                break;
            case 2:
                try {
                    vehicleId = rentalsystem.getVehicleId();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }

        scanner.nextLine();


        System.out.println("Wollen Sie den Preis ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int priceChoice = scanner.nextInt();
        switch (priceChoice) {
            case 1:
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
                break;
            case 2:
                try {
                    price = rentalsystem.getPrice();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();


        System.out.println("Wollen Sie die Mietdauer ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int rentalPeriodChoice = scanner.nextInt();
        switch (rentalPeriodChoice) {
            case 1:
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
                break;
            case 2:
                try {
                    rentalPeriod = rentalsystem.getRentalPeriod();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();

        System.out.println("Wollen Sie die Strasse und Nummer ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String streetNumberChoice = scanner.nextLine();
        switch (streetNumberChoice) {
            case "1":
                streetNumber = "";
                while (streetNumber.equals("")) {
                    System.out.println("Strasse und Nummer:");
                    streetNumber = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    streetNumber = rentalsystem.getStreetNumber();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige EIngabe");
                break;

        }



        System.out.println("Wollen Sie die Postleitzahl ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int postcodeChoice = scanner.nextInt();
        switch (postcodeChoice) {
            case 1:
                System.out.println("Postleitzahl:");
                do {
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Dies ist keine Nummer!");
                        scanner.next(); // this is important!
                        a = false;
                    } else {
                        postcode = scanner.nextInt();
                        a = true;
                    }
                } while (a == false);
                break;
            case 2:
                try {
                    postcode = rentalsystem.getPostcode();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();


        System.out.println("Wollen Sie den Wohnort ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String placeOfDurationChoice = scanner.nextLine();
        switch (placeOfDurationChoice) {
            case "1":
                placeOfDuration = "";
                while (placeOfDuration.equals("")) {
                    System.out.println("Wohnort:");
                    placeOfDuration = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    placeOfDuration = rentalsystem.getPlaceOfDuration();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige EIngabe");
                break;

        }

        System.out.println("Wollen Sie den Status ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String statusChoice = scanner.nextLine();
        switch (statusChoice) {
            case "1":
                status = "";
                while (status.equals("")) {
                    System.out.println("Wohnort:");
                    status = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    status = rentalsystem.getStatus();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige EIngabe");
                break;

        }


        System.out.println("Wollen Sie die Telefonnummer ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String telephoneChoice = scanner.nextLine();
        switch (telephoneChoice) {
            case "1":
                telephone = "";
                while (telephone.equals("")) {
                    System.out.println("Telefonnummer:");
                    telephone = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    telephone = rentalsystem.getTelephone();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige EIngabe");
                break;

        }


        System.out.println("Wollen Sie die Email ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String emailChoice = scanner.nextLine();
        switch (emailChoice) {
            case "1":
                email = "";
                while (email.equals("")) {
                    System.out.println("Email:");
                    email = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    email = rentalsystem.getEmail();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige EIngabe");
                break;

        }

        System.out.println("Wollen Sie das Geburtstagsdatum ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String DateOfBirthChoice = scanner.nextLine();
        switch (DateOfBirthChoice) {
            case "1":
                DateOfBirth = "";
                while (DateOfBirth.equals("")) {
                    System.out.println("Geburtstagsdatum:");
                    DateOfBirth = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    DateOfBirth = rentalsystem.getDateOfBirth();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige EIngabe");
                break;

        }
        try{
            rentalId = rentalsystem.getRentalId();
        }catch (NullPointerException e){
        }

        Rentalsystem rentalsystem = new Rentalsystem(vehicleId, price, rentalPeriod, streetNumber, postcode, placeOfDuration, status, telephone, email, DateOfBirth);
        try {
            JSONDatabase.editRentalsystem(rentalsystem, rentalId);
        }catch(IOException e) {
        }
        Controller.mainWindow();

    }

}



