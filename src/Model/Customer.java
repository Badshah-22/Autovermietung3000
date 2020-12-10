package Model;

import DB.JSONDatabase;

public class Customer  {

    protected int customerId;
    String FirstName;
    String LastName;
    String telephone;
    String Email;


    private static int counter = JSONDatabase.getAllVehicleListSize();

    public Customer() {
    }

    public Customer(String firstName, String lastName, String telephone, String email) {
        this.customerId = counter++;
        FirstName = firstName;
        LastName = lastName;
        this.telephone = telephone;
        Email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public static void setCounter(int counter) { Customer.counter = counter;
    }

}

