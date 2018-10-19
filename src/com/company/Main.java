package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<CafeInvoice> items = new ArrayList<>();
        String response = "";
        String stateResponse = "";
        double entry = 0;
        double grandTaxes = 0;

        do {
            System.out.println("Enter an item");
            String item = in.nextLine();
            System.out.println("Enter price");
            double price = in.nextDouble();
            System.out.println("Enter quantity");
            int quantity = in.nextInt();
            System.out.println("Is item taxable? true or false");
            boolean taxable = in.nextBoolean();
            if (taxable == true) {
                System.out.println("Which state are you in - MD, DC, VA or other");
                stateResponse = in.next();
                in.nextLine();

                if (stateResponse.equalsIgnoreCase("MD")) {
                    //System.out.println("MD - 6.00%");
                    entry = price * quantity * .06;
                    System.out.println(entry);
                } else if (stateResponse.equalsIgnoreCase("DC")) {
                    //System.out.println(("DC - 5.30%"));
                    entry = price * quantity * .0530;

                } else if (stateResponse.equalsIgnoreCase("VA")) {
                    //System.out.println("VA - 5.75%");
                    entry = price * quantity * .0575;

                } else {
                    //System.out.println("Other states - 5.00%");
                    entry = price * quantity * .0575;

                }

            }
            items.add(new CafeInvoice(item, price, quantity, taxable));
            System.out.println("Do you want to add another item? yes or no");
            response = in.next();
            in.nextLine();
        } while (!response.equalsIgnoreCase("no"));

        double grandTotal = 0;
        double grandTotal2 = 0;
        System.out.println("Item\t" + "Price\t " + "Quantity\t " + "Cost\t " + "Taxable\t ");
        System.out.println("=====================================================================");
        for (CafeInvoice g : items) {
            System.out.print(g.getName() + "\t");
            System.out.print("$" + g.getPrice() + "\t\t");
            System.out.print(g.getQuantity() + "\t\t");
            System.out.print(g.getCost() + "\t\t");
            System.out.print(g.isTaxable() + "\t\n");

            grandTotal += g.getCost();
            grandTaxes += entry;
            grandTotal2 = grandTotal + grandTaxes;
        }
        System.out.println("Subtotal: " + "$" + grandTotal);
        //System.out.println();
        System.out.print("Sales Tax: $");
        System.out.printf("%.2f",grandTaxes);
        System.out.println();
        System.out.print("Grand Total: $");
        System.out.printf("%.2f",grandTotal2);

    }







}
