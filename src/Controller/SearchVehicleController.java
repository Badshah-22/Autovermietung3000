package Controller;



import DB.JSONDatabase;

import java.io.IOException;
import java.util.Scanner;

public class SearchVehicleController {


    static String category;
    static String VehicleType;


    private static boolean a = false;

    public static void searchVehicle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Fahrzeug suchen Sie?");
        System.out.println("________________________________:");
        System.out.println("1. Kategorie");
        System.out.println("2. Fahrzeugtyp");
        System.out.println("3. Zurück zum Menu");

        while (!scanner.hasNext("[123]")) {
            System.out.println("Invalid input, please type a valid letter grade");
            scanner.nextLine();
        }

        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                capturecategory();
                break;
            case 2:
                captureVehicleType();
                break;
            case 3:
                Controller.mainWindow();
                break;
        }
    }

    public static void captureVehicleType() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Suchen Sie nach Fahrzeugtyp [Auto, Motorrad, Transporter]");
        VehicleType = scanner.nextLine();
        while (!VehicleType.equals("Auto") && !VehicleType.equals("Motorrad") && !VehicleType.equals("Transporter")){
            System.out.println("Dieser Fahrzeugtyp existiert nicht.");
            VehicleType = scanner.nextLine();
        }

        if (VehicleType.matches("Auto")){
            System.out.println("\tID / Marke / Model / Verfügbar?");
            System.out.println("\t___________________________________");
            for (int i = 0; i < JSONDatabase.getAllVehiclesList().size(); i++) {
                System.out.println("\t" + JSONDatabase.getAllVehiclesList().get(i).getVehicleId() + " / " + JSONDatabase.getAllVehiclesList().get(i).getBrand() + " / " + JSONDatabase.getAllVehiclesList().get(i).getModel() + " / " + JSONDatabase.getAllVehiclesList().get(i).isNotAvailable());
            }
            if (scanner.hasNextLine()){
                Controller.mainWindow();
            }
        }
        if(VehicleType.matches("Motorrad")){
            System.out.println("\tID / Marke / Model / Verfügbar?");
            System.out.println("\t___________________________________");
            for (int i = 0; i < JSONDatabase.getAllVehiclesList().size(); i++) {
                System.out.println("\t" + JSONDatabase.getAllVehiclesList().get(i).getVehicleId() + " / " + JSONDatabase.getAllVehiclesList().get(i).getBrand() + " / " + JSONDatabase.getAllVehiclesList().get(i).getModel() + " / " + JSONDatabase.getAllVehiclesList().get(i).isNotAvailable());
            }
            if (scanner.hasNextLine()){
                Controller.mainWindow();
            }
        }
        if (VehicleType.matches("Transporter")) {
            System.out.println("\tID / Marke / Model / Verfügbar?");
            System.out.println("\t___________________________________");
            for (int i = 0; i < JSONDatabase.getAllVehiclesList().size(); i++) {
                System.out.println("\t" + JSONDatabase.getAllVehiclesList().get(i).getVehicleId() + " / " + JSONDatabase.getAllVehiclesList().get(i).getBrand() + " / " + JSONDatabase.getAllVehiclesList().get(i).getModel() + " / " + JSONDatabase.getAllVehiclesList().get(i).isNotAvailable());
            }
            if (scanner.hasNextLine()) {
                Controller.mainWindow();
            }
        }



    }

    public static void capturecategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Kategorie von Auto suchen Sie? [ basic | medium | luxus");
        category = scanner.nextLine();
        while (!category.matches("basic") && !category.matches("medium") && !category.matches("luxus")){
            System.out.println("Dieser Fahrzeugtyp existiert nicht.");
            category = scanner.nextLine();
        }
        if (category.matches("basic")){
            System.out.println("\tID / Marke / Model / Verfügbar?");
            System.out.println("\t___________________________________");
            for (int i = 0; i < JSONDatabase.getAllVehiclesList().size(); i++) {
                if (JSONDatabase.getAllVehiclesList().get(i).getCategory().matches("basic")) {
                    System.out.println("\t" + JSONDatabase.getAllVehiclesList().get(i).getVehicleId() + " / " + JSONDatabase.getAllVehiclesList().get(i).getBrand() + " / " + JSONDatabase.getAllVehiclesList().get(i).getModel() + " / " + JSONDatabase.getAllVehiclesList().get(i).isNotAvailable());
                }
            }
            if (scanner.hasNextLine()){
                Controller.mainWindow();
            }
        }
        if(category.matches("medium")){
            System.out.println("\tID / Marke / Model / Verfügbar?");
            System.out.println("\t___________________________________");
            for (int i = 0; i < JSONDatabase.getAllVehiclesList().size(); i++) {
                if (JSONDatabase.getAllVehiclesList().get(i).getCategory().matches("medium")) {
                    System.out.println("\t" + JSONDatabase.getAllVehiclesList().get(i).getVehicleId() + " / " + JSONDatabase.getAllVehiclesList().get(i).getBrand() + " / " + JSONDatabase.getAllVehiclesList().get(i).getModel() + " / " + JSONDatabase.getAllVehiclesList().get(i).isNotAvailable());
                }
            }
            if (scanner.hasNextLine()){
                Controller.mainWindow();
            }
        }
        if (category.matches("luxus")){
            System.out.println("\tID / Marke / Model / Verfügbar?");
            System.out.println("\t___________________________________");
            for (int i = 0; i < JSONDatabase.getAllVehiclesList().size(); i++) {
                if (JSONDatabase.getAllVehiclesList().get(i).getCategory().matches("luxus")) {
                    System.out.println("\t" + JSONDatabase.getAllVehiclesList().get(i).getVehicleId() + " / " + JSONDatabase.getAllVehiclesList().get(i).getBrand() + " / " + JSONDatabase.getAllVehiclesList().get(i).getModel() + " / " + JSONDatabase.getAllVehiclesList().get(i).isNotAvailable());
                }
            }
            if (scanner.hasNextLine()){
                Controller.mainWindow();
            }
        }

    }
}
