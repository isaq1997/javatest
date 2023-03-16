package com.company;

import java.util.Date;

public class Visit extends Customer {
    private Customer customer;
    private int    date;
    private double serviceExpense;
    private double productExpense;

    public Visit( String name,int date) {
        super(name);
        this.date = date;


    }

    public String getName() {
        return customer.getName();
    }




    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense() {
        return serviceExpense*productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
