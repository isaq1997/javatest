package com.company;

public final class DiscountRate {
    Customer customer;
    double serviceDiscountPremium=0.2;
    double serviceDiscountGold=0.15;
    double serviceDiscountSilver=0.1;
    double productDiscountPremium=0.1;
    double productDiscountGold=0.1;
    double productDiscountSilver=0.1;

    public double getProductDiscountRate(String type) {
        if (type=="Premium") {
            return productDiscountPremium;
        }
        else if (type=="Gold") {
            return productDiscountGold;
        }
        else if (type=="Silver") {
            return productDiscountSilver;
        }
        return 0;
    }
    public double getServiceDiscountRate(String type) {
        if (type=="Premium") {
            return serviceDiscountPremium;
        }
        else if (type=="Gold") {
            return serviceDiscountGold;
        }
        else if (type=="Silver") {
            return serviceDiscountSilver;
        }
        return 0;
    }
}
