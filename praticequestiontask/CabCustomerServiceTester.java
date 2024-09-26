package com.praticequestiontask;


import java.util.ArrayList;

class CabCustomer {
    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private String phone;

    // Getter and Setter methods
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // No Argument Constructor
    public CabCustomer() {
    }

    // Parameterized Constructor
    public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }
}

class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    // Add customer to the list
    public void addCabCustomer(CabCustomer customer) {
        customerList.add(customer);
    }

    // Check if the customer is the first time
    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer c : customerList) {
            if (c.getPhone().equals(customer.getPhone())) {
                return false; // Existing customer
            }
        }
        return true; // New customer
    }

    // Calculate bill for the customer
    public double calculateBill(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            return 0; // No charge for new customer
        } else {
            if (customer.getDistance() <= 4) {
                return 80.0;
            } else {
                return 80.0 + 6.0 * (customer.getDistance() - 4);
            }
        }
    }

    // Print bill for the customer
    public void printBill(CabCustomer customer) {
        double bill = calculateBill(customer);
        System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + bill);
    }
}

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService cabService = new CabCustomerService();

        // Creating customer objects
        CabCustomer customer1 = new CabCustomer(1, "John", "Location1", "Location2", 6, "1234567890");
        CabCustomer customer2 = new CabCustomer(2, "Smith", "Location3", "Location4", 4, "9876543210");

        // Adding customers to the service
        cabService.addCabCustomer(customer1);
        cabService.addCabCustomer(customer2);

        // Testing the bill calculation
        cabService.printBill(customer1);
        cabService.printBill(customer2);
    }
}
