package edu.nf.ch03.payment.impl;

import edu.nf.ch03.payment.Payment;
import edu.nf.ch03.payment.Product;

public class NormalCharge extends Payment {
    @Override
    public double pay(Product p, int money) {
        double returVal = money-p.getPrice();
        System.out.println("实收："+money);
        System.out.println("找零："+returVal);
        return returVal;
    }
}
