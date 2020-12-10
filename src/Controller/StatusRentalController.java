package Controller;

import DB.JSONDatabase;

import java.io.IOException;
import java.util.Scanner;

public class StatusRentalController {

    static int rentalId;
    static String status;

    private static boolean a = false;


    public static void statusRental() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\tVermietungs ID / Fahrzeug ID / Preis / Status");
        System.out.println("\t___________________________________");
        for (int i = 0; i < JSONDatabase.getRentingsList().size(); i++) {
            System.out.println("\t" + JSONDatabase.getRentingsList().get(i).getRentalId() + " / " + JSONDatabase.getRentingsList().get(i).getVehicleId() + " / " + JSONDatabase.getRentingsList().get(i).getPrice() + " / " + JSONDatabase.getRentingsList().get(i).getStatus());
        }

        do {
            System.out.println("Geben Sie die Vermietungs ID ein:");
            if (scanner.hasNextInt()) {
                rentalId = scanner.nextInt();
                a = true;
            } else {
                System.out.println("Dies ist keine Nummer!");
                scanner.next(); // this is important!
                a = false;
            }
        } while (a == false);


        status = "";
        scanner.nextLine();
        while (status.equals("")) {
            System.out.println("Status verändern: [ offen | bezahlt | abgeschlossen ]");
            status = scanner.nextLine();
        }

        try {
            JSONDatabase.changeStatus(rentalId, status);
        }
        catch(IOException e) {
        }

        Controller.mainWindow();
    }

}