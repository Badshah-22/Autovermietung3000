package Controller;



import DB.JSONDatabase;
import Model.Bike;
import Model.Car;
import Model.Transporter;

import java.io.IOException;
import java.util.Scanner;

public class CaptureVehicleController {

    static String brand;
    static String model;
    static double  cubicCapacity;
    static String fuelType;
    static String color;
    static double currentKilometer;
    static String licensePlate;
    static String category;
    static String availableFrom;
    static String availableUntil;
    static boolean notAvailable;
    static boolean NAV;
    static double TrunkSpace;
    static String Size;
    static double weight;
    static float Tankcolume;

    private static boolean a = false;

    public static void captureVehicle() {
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
                captureCar();
                break;
            case 2:
                captureBike();
                break;
            case 3:
                captureTransport();
                break;

            case 4:
                Controller.mainWindow();
                break;
        }
    }

    public static void captureVehicleAttributes(){
        Scanner scanner = new Scanner(System.in);


        brand = "";
        while(brand.equals("")) {
            System.out.println("Marke:");
            brand = scanner.nextLine();
        }

        model = "";
        while(model.equals("")) {
            System.out.println("Model:");
            model= scanner.nextLine();
        }


        System.out.println("Hubraum:");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            }else{
                cubicCapacity = scanner.nextDouble();
                a = true;
            }
        } while (a == false);

        scanner.nextLine();

        fuelType = "";
        while(fuelType.equals("")) {
            System.out.println("Treibstoffart:");
            fuelType = scanner.nextLine();
        }

        color = "";
        while(color.equals("")) {
            System.out.println("Farbe:");
            color = scanner.nextLine();
        }

        System.out.println("Aktueller Km-Stand:");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            }else{
                currentKilometer = scanner.nextDouble();
                a = true;
            }
        } while (a == false);

        scanner.nextLine();

        licensePlate = "";
        while(licensePlate.equals("")) {
            System.out.println("Kennzeichen:");
            licensePlate = scanner.nextLine();
        }

        category = "";
        while(category.equals("")) {
            System.out.println("Kategorie: [ basic | medium | luxus | sport ]");
            category = scanner.nextLine();

        }

        availableFrom = "";
        while(availableFrom.equals("")) {
            System.out.println("Verfügbar ab Datum:");
            availableFrom = scanner.nextLine();
        }


        availableUntil = "";
        while(availableUntil.equals("")) {
            System.out.println("Verfügbar bis Datum:");
            availableUntil = scanner.nextLine();
        }

        do {
            System.out.println("Verfügbar? [true/false]");
            if (scanner.hasNextBoolean()){
                notAvailable = scanner.nextBoolean();
                notAvailable = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                notAvailable = false;
                scanner.nextLine();
            }
        }while (notAvailable == false);
    }

    private static void captureTransport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tErfassen Sie nun Ihren Transporter");
        captureVehicleAttributes();

        System.out.println("Ladegewicht:");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            }else{
                weight = scanner.nextDouble();
                a = true;
            }
        } while (a == false);

        Transporter transport = new Transporter(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable, weight);
        try {
            JSONDatabase.addTransport(transport);
        }catch(IOException e) {
        }
        Controller.mainWindow();

    }

    public static void captureCar() {
        System.out.println("\tErfassen Sie nun Ihr Auto");
        Scanner scanner = new Scanner(System.in);
        captureVehicleAttributes();

        do {
            System.out.println("Navigation? [true/false]");
            if (scanner.hasNextBoolean()){
                NAV = scanner.nextBoolean();
                NAV = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                NAV = false;
                scanner.nextLine();
            }
        }while (NAV == false);

        System.out.println("Kofferraumplatz:");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            }else{
                TrunkSpace = scanner.nextDouble();
                a = true;
            }
        } while (a == false);

        scanner.nextLine();

        Size = "";
        while(Size.equals("")) {
            System.out.println("Aufbau: [ Kleinwagen | Limousine | Combi | SUV | Cabriolet | Sportwagen ]");
            Size = scanner.nextLine();
        }

        Car car = new Car(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable, NAV, TrunkSpace, Size);
        try {
            JSONDatabase.addCar(car);
        }catch(IOException e) {
        }
        Controller.mainWindow();
    }

    public static void captureBike() {
        System.out.println("\tErfassen Sie nun Ihren Motorrad");
        captureVehicleAttributes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("TankVolumen: [Liter]");
        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            }else{
                Tankcolume = scanner.nextFloat();
                a = true;
            }
        } while (a == false);

        Bike bike = new Bike(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable, Tankcolume);
        try {
            JSONDatabase.addBike(bike);
        }catch(IOException e) {
        }
        Controller.mainWindow();
    }
}

