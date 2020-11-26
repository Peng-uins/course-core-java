package edu.nf.ch03.payment;

import edu.nf.ch03.payment.impl.DiscountCharae;

public class Main {
    public static void main(String[] args) {
        //Payment p = new Calc();
        Product pr = new Product("手机",1,5000);
       // p.output(p.pay(pr,20000));

        /*Payment p = new Discount(0.7);
        p.output(p.pay(pr,10000));*/
        Payment p = new DiscountCharae(0.8);
        p.output(p.pay(pr,1000));
    }
}
