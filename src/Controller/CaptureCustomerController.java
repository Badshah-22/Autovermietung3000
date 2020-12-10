package Controller;

import DB.JSONDatabase;
import Model.Customer;

import java.io.IOException;
import java.util.Scanner;

public class CaptureCustomerController {

    static String firstName;
    static String lastName;
    static String telephone;
    static String email;


    public static void captureCustomer() {

        Scanner scanner = new Scanner(System.in);

        firstName = "";
        while(firstName.equals("")) {
            System.out.println("Vorname:");
            firstName= scanner.nextLine();
        }

        lastName = "";
        while(lastName.equals("")) {
            System.out.println("Nachname:");
            lastName= scanner.nextLine();
        }

        telephone = "";
        while(telephone.equals("")) {
            System.out.println("Telefon:");
            telephone= scanner.nextLine();
        }

        email = "";
        while(email.equals("")) {
            System.out.println("Email:");
            email= scanner.nextLine();
        }

        Customer customer = new Customer(firstName, lastName, telephone, email);
        try {
            JSONDatabase.addCustomer(customer);
        }catch(IOException e) {
        }
        Controller.mainWindow();
    }
    }


