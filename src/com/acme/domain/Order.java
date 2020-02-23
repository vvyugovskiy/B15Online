package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
    MyDate orderDate;
    double orderAmount = 0.00;
    String customer;
    String product;
    int quantity;
    public static double taxRate;

    public static void setTaxRate(double newRate) {
        taxRate = newRate;
    }

    public static void computeTaxOn(double anAmount) {
        System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
    }

    public Order(MyDate d, double amt, String c, String p, int q) {
        orderDate = d;
        orderAmount = amt;
        customer = c;
        product = p;
        quantity = q;
    }

    public String toString() {
        return quantity + " ea. " + product + " for " + customer;
    }

    public double computeTax() {
        System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
        return orderAmount * Order.taxRate;
    }

    public char jobSize() {
        if (quantity <= 25) {
            return 'S';
        } else if (quantity >= 25 && quantity <= 75) {
            return 'M';
        } else if (quantity >= 76 && quantity <= 150) {
            return 'L';
        }
        return 'X';
    }

    double orderTotal;

    public double computeTotal() {
        double total = orderAmount;
        switch (jobSize()) {
            case 'M': total = total - (orderAmount * 0.01);
            break;
			case 'L' : total = total - (orderAmount * 0.02);
			break;
			case 'X' : total = total - (orderAmount * 0.03);
			break;
        }
        if (orderAmount<=1500){
        	total = total+computeTax();
		}
        return total;
    }
}