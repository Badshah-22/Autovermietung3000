package Controller;

import DB.JSONDatabase;

import java.io.IOException;
import java.util.Scanner;

public class AvailableVehicleController {

    static int vehicleId;
    static boolean notAvailable;

    private static boolean a = false;

    public static void availableVehicle() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Transport");
        System.out.println("4. Zurück zum Menu");

        while (!scanner.hasNext("[1234]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }

        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                availableCar();
                break;
            case 2:
                availableBike();
                break;
            case 3:
                availableTransport();
                break;
            case 4:
                Controller.mainWindow();
                break;
        }
    }



    private static void availableTransport() {

        System.out.println(" Fahrzeug ID / Marke / Model / Verfügbar? ");
        System.out.println("____________________________________:");
        for (int i = 0; i < JSONDatabase.getAllTransportersList().size(); i++) {
            System.out.println(JSONDatabase.getAllTransportersList().get(i).getVehicleId() + "/" + JSONDatabase.getAllTransportersList().get(i).getBrand()  + "/" + JSONDatabase.getAllTransportersList().get(i).getModel()  + "/" + JSONDatabase.getAllTransportersList().get(i).isNotAvailable());
        }
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\tGeben Sie die gewünschte Transporter ID ein");
            if (scanner.hasNextInt()) {
                vehicleId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);

        do {
            System.out.println(" Ist der Transporter Verfügbar? [true/false]");
            if (scanner.hasNextBoolean()){
                notAvailable = scanner.nextBoolean();
                notAvailable = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                notAvailable = false;
                scanner.nextLine();
            }
        }while (notAvailable == false);

        try {
            JSONDatabase.checkAvailable(vehicleId, notAvailable);
        }
        catch(IOException e) {
        }
        Controller.mainWindow();
    }


    private static void availableBike() {

        System.out.println(" Fahrzeug ID / Marke / Model / Verfügbar ");
        System.out.println("____________________________________:");
        for (int i = 0; i < JSONDatabase.getAllMotorcyclesList().size(); i++) {
            System.out.println(JSONDatabase.getAllMotorcyclesList().get(i).getVehicleId() + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getBrand()  + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getModel()  + "/" + JSONDatabase.getAllMotorcyclesList().get(i).isNotAvailable());
        }
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\tGeben Sie die gewünschte Bike ID ein");
            if (scanner.hasNextInt()) {
                vehicleId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);

        do {
            System.out.println(" Ist das Bike Verfügbar? [true/false]");
            if (scanner.hasNextBoolean()){
                notAvailable = scanner.nextBoolean();
                notAvailable = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                notAvailable = false;
                scanner.nextLine();
            }
        }while (notAvailable == false);

        try {
            JSONDatabase.checkAvailable(vehicleId, notAvailable);
        }
        catch(IOException e) {
        }
        Controller.mainWindow();
    }


    private static void availableCar() {

        System.out.println(" Fahrzeug ID / Marke / Model / Verfügbar? ");
        System.out.println("____________________________________:");
        for (int i = 0; i < JSONDatabase.getAllCarsList().size(); i++) {
            System.out.println(JSONDatabase.getAllCarsList().get(i).getVehicleId() + "/" + JSONDatabase.getAllCarsList().get(i).getBrand()  + "/" + JSONDatabase.getAllCarsList().get(i).getModel()  + "/" + JSONDatabase.getAllCarsList().get(i).isNotAvailable());
        }
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\tGeben Sie die gewünschte Auto ID ein:");
            if (scanner.hasNextInt()) {
                vehicleId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);

        do {
            System.out.println(" Ist das Auto Verfügbar? [true/false]");
            if (scanner.hasNextBoolean()){
                notAvailable = scanner.nextBoolean();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.nextLine();
            }
        }while (a == false);

        try {
            JSONDatabase.checkAvailable(vehicleId, notAvailable);
        }
        catch(IOException e) {
        }
        Controller.mainWindow();
    }


}

