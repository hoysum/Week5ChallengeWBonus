package com.company;

public class CafeInvoice {

    private String name;
    private double price;
    private int quantity;
    private boolean isTaxable;
    private String state;

    public CafeInvoice() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CafeInvoice(String state) {
        this.state = state;

    }

    public CafeInvoice(String name, double price, int quantity, boolean isTaxable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isTaxable = isTaxable;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }


    public double getCost(){
        double cost = price * quantity;

        return cost;
    }

}