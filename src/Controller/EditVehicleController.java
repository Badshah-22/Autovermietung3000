package Controller;
import DB.JSONDatabase;
import Model.Bike;
import Model.Car;
import Model.Transporter;
import Model.Vehicle;

import java.io.IOException;
import java.util.Scanner;

public class EditVehicleController {


    public static void EditVehicle() {


        System.out.println("Welchen Fahrzeugtyp wollen Sie ändern");

        captureVehicle();
    }
    public static Vehicle vehicle;
    public static Car car;
    public static Bike bike;
    public static Transporter transport;
    static int vehicleId;
    static String brand;
    static String model;
    static double cubicCapacity;
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
    static float TankVolume;

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
                editCar();
                break;
            case 2:
                editBike();
                break;
            case 3:
                editTransport();
                break;
            case 4:
                Controller.mainWindow();
                break;
        }
    }

    public static void captureVehicleAttributes() {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Wollen Sie die Marke ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String brandChoice = scanner.nextLine();
            switch (brandChoice) {
                case "1":
                    brand = "";
                        while (brand.equals("")) {
                        System.out.println("Marke:");
                        brand = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        brand = vehicle.getBrand();
                    } catch (NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Unguültige EIngabe");
                    break;
            }


            System.out.println("Wollen Sie das Model ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String modelChoice = scanner.nextLine();
            switch (modelChoice) {
                case "1":
                    model = "";
                        while (model.equals("")) {
                        System.out.println("Model:");
                        model = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        model = vehicle.getModel();
                    } catch (NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Unguültige EIngabe");
                    break;
            }


        System.out.println("Wollen Sie den Hubraum ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int cubicCapacityChoice = scanner.nextInt();
        switch (cubicCapacityChoice) {
            case 1:
                System.out.println("Hubraum:");
                do {
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Dies ist keine Nummer!");
                        scanner.next(); // this is important!
                        a = false;
                    } else {
                        cubicCapacity = scanner.nextDouble();
                        a = true;
                    }
                } while (a == false);
                break;
            case 2:
                try {
                    cubicCapacity = vehicle.getCubicCapacity();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();

        System.out.println("Wollen Sie die Treibstoffart ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String fuelTypeChoice = scanner.nextLine();
        switch (fuelTypeChoice) {
            case "1":
                fuelType = "";
                while (fuelType.equals("")) {
                    System.out.println("Treibstoffart:");
                    fuelType = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    fuelType = vehicle.getFuelType();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }


        System.out.println("Wollen Sie die Farbe ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        String colorChoice = scanner.nextLine();
        switch (colorChoice) {
            case "1":
                color = "";
                while (color.equals("")) {
                    System.out.println("Farbe:");
                    color = scanner.nextLine();
                }
                break;
            case "2":
                try {
                    color = vehicle.getColor();
                } catch (NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;


}

        System.out.println("Wollen Sie den aktuellen Km-Stand ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int currentKilometerChoice = scanner.nextInt();
        switch (currentKilometerChoice) {
            case 1:
                System.out.println("Aktueller Km-Stand");
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
                break;
            case 2:
                try {
                    currentKilometer = vehicle.getCurrentKilometer();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();



            System.out.println("Wollen Sie das Kennzeichen ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String licensePlateChoice = scanner.nextLine();
            switch (licensePlateChoice) {
                case "1":
                    licensePlate = "";
                    while (licensePlate.equals("")) {
                        System.out.println("Kennzeichen:");
                        licensePlate = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        licensePlate = vehicle.getLicensePlate();
                    }catch(NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Ungültige EIngabe");
                    break;

            }

            System.out.println("Wollen Sie die Kategorie ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String categoryChoice = scanner.nextLine();
            switch (categoryChoice) {
                case "1":
                    category = "";
                    while (category.equals("")) {
                        System.out.println("Kategorie: [basic | medium | luxus]");
                        category = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        category = vehicle.getCategory();
                    } catch (NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Ungültige EIngabe");
                    break;

            }
            System.out.println("Wollen Sie das Verfügbar ab Datum ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String  availableFromChoice = scanner.nextLine();
            switch (availableFromChoice) {
                case "1":
                    availableFrom = "";
                    while(availableFrom.equals("")) {
                        System.out.println("Verfügbar ab Datum:");
                        scanner.nextLine();
                        availableFrom = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        availableFrom = vehicle.getAvailableFrom();
                    }catch(NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Ungültige EIngabe");
                    break;

            }


            System.out.println("Wollen Sie das Verfügbar bis Datum ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String availableUntilChoice = scanner.nextLine();
            switch (availableUntilChoice) {
                case "1":
                    availableUntil = "";
                    while(availableUntil.equals("")) {
                        System.out.println("Verfügbar bis Datum:");
                        availableUntil = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        availableUntil = vehicle.getAvailableUntil();
                    }catch(NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Ungültige EIngabe");
                    break;
            }
        }


    private static void editTransport() {

        System.out.println(" Fahrzeug ID / Marke / Model / Farbe / Kennzeichen");
        System.out.println("____________________________________:");
        for (int i = 0; i < JSONDatabase.getAllTransportersList().size(); i++) {
            System.out.println(JSONDatabase.getAllTransportersList().get(i).getVehicleId() + "/" + JSONDatabase.getAllTransportersList().get(i).getBrand()  + "/" + JSONDatabase.getAllTransportersList().get(i).getModel()  + "/" + JSONDatabase.getAllTransportersList().get(i).getColor()  + "/" + JSONDatabase.getAllTransportersList().get(i).getLicensePlate());
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
        try {
            JSONDatabase.showTransport(vehicleId);
            JSONDatabase.showVehicle(vehicleId);
        }catch(IOException e) {
        }

        captureVehicleAttributes();


        System.out.println("Wollen SIe das Ladegewicht ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int weightChoice = scanner.nextInt();
        switch (weightChoice) {
            case 1:
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
                break;
            case 2:
                try {
                    weight = transport.getWeight();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();
        try{
            vehicleId = vehicle.getVehicleId();
        }catch (NullPointerException e){
        }
        Transporter transport = new Transporter(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable, weight);
        try {
            JSONDatabase.editTransport(transport, vehicleId);
        }catch(IOException e) {
        }

        Controller.mainWindow();

    }

    public static void editCar() {

        System.out.println(" Fahrzeug ID / Marke / Model / Farbe / Kennzeichen");
        System.out.println("____________________________________:");

        for (int i = 0; i < JSONDatabase.getAllCarsList().size(); i++) {
            System.out.println(JSONDatabase.getAllCarsList().get(i).getVehicleId() + "/" + JSONDatabase.getAllCarsList().get(i).getBrand()  + "/" + JSONDatabase.getAllCarsList().get(i).getModel()  + "/" + JSONDatabase.getAllCarsList().get(i).getColor()  + "/" + JSONDatabase.getAllCarsList().get(i).getLicensePlate());
        }

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\tGeben Sie die gewünschte Auto ID ein");
            if (scanner.hasNextInt()) {
                vehicleId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);
        try {
            JSONDatabase.showCar(vehicleId);
            JSONDatabase.showVehicle(vehicleId);
        }catch(IOException e) {
        }

        captureVehicleAttributes();


        System.out.println("Wollen Sie Ihre Navigation ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int NAVChoice = scanner.nextInt();
        switch (NAVChoice) {
            case 1:
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
                break;
            case 2:
                try {
                   NAV = car.isNAV();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();


        System.out.println("Wollen Sie Ihren Kofferraumplatz ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int TrunkSpaceChoice = scanner.nextInt();
        switch (TrunkSpaceChoice) {
            case 1:
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
                break;
            case 2:
                try {
                    TrunkSpace = car.getTrunkSpace();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();


        System.out.println("Wollen Sie den Aufbau ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
            String SizeChoice = scanner.nextLine();
            switch (SizeChoice) {
                case "1":
                    Size = "";
                    while(Size.equals("")) {
                        System.out.println("Aufbau: [ Kleinwagen | Limousine | Combi | SUV | Cabriolet]");
                        scanner.nextLine();
                        Size = scanner.nextLine();
                    }
                    break;
                case "2":
                    try {
                        Size = car.getSize();
                    }catch(NullPointerException e) {
                    }
                    break;
                default:
                    System.out.println("Ungültige EIngabe");
                    break;

            }


        scanner.nextLine();
        try{
            vehicleId = vehicle.getVehicleId();
        }catch (NullPointerException e){
        }
        Car car = new Car(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable, NAV, TrunkSpace, Size);
        try {
            JSONDatabase.editCar(car, vehicleId);
        }catch(IOException e) {
        }

        Controller.mainWindow();
    }

    public static void editBike() {

        System.out.println(" Fahrzeug ID / Marke / Model / Farbe / Kennzeichen");
        System.out.println("____________________________________:");
        for (int i = 0; i < JSONDatabase.getAllMotorcyclesList().size(); i++) {
            System.out.println(JSONDatabase.getAllMotorcyclesList().get(i).getVehicleId() + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getBrand()  + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getModel()  + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getColor()  + "/" + JSONDatabase.getAllMotorcyclesList().get(i).getLicensePlate());
        }

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\tGeben Sie die gewünschte Motorrad ID ein");
            if (scanner.hasNextInt()) {
                vehicleId = scanner.nextInt();
                a = true;
            }else {
                System.out.println("Die Eingabe war leider ungültig.");
                a = false;
                scanner.next();
            }
        }while(a == false);
        try {
            JSONDatabase.showBike(vehicleId);
            JSONDatabase.showVehicle(vehicleId);
        }catch(IOException e) {
        }


        captureVehicleAttributes();


        System.out.println("Wollen Sie Ihren TankVolumen [Liter] ändern: [ 1.JA | 2.NEIN");
        while (!scanner.hasNext("[12]")) {
            System.out.println("Ungültige Eingabe, Bitte versuchen Sie es nochmal");
            scanner.nextLine();
        }
        int TankcolumeChoice = scanner.nextInt();
        switch (TankcolumeChoice) {
            case 1:
                System.out.println("TankVolumen: [Liter]");
                do {
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Dies ist keine Nummer!");
                        scanner.next(); // this is important!
                        a = false;
                    }else{
                        TankVolume = scanner.nextFloat();
                        a = true;
                    }
                } while (a == false);
                scanner.nextLine();
                break;
            case 2:
                try {
                    TankVolume = bike.getTankVolume();
                }catch(NullPointerException e) {
                }
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        scanner.nextLine();
        try{
            vehicleId = vehicle.getVehicleId();
        }catch (NullPointerException e){
        }
        Bike bike = new Bike(brand, model, cubicCapacity, fuelType, color, currentKilometer, licensePlate, category, availableFrom, availableUntil, notAvailable, TankVolume);
        try {
            JSONDatabase.editBike(bike, vehicleId);
        }catch(IOException e) {
        }

        Controller.mainWindow();
    }

    public static void editVehicle() {
    }
}




