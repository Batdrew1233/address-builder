package com.plurasight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = myScanner.nextLine();

        //Get billing address info
        System.out.println("Billing Street: ");
        String billingStreet = myScanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity = myScanner.nextLine();
        System.out.println("Billing State: ");
        String billingState = myScanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip = myScanner.nextLine();

        //Get Shipping Address info
        System.out.println("\nShipping Street: ");
        String shippingStreet = myScanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

        //Building String Builder For Billing Address
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingAddress).append("\n");
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZip);

        //Building String Builder For Shipping Address
        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ");
        shippingAddress.append(shippingState).append(" ");
        shippingAddress.append(shippingZip);



    }
}
