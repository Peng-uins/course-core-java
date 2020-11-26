package edu.nf.ch03.payment.impl;

import edu.nf.ch03.payment.Payment;
import edu.nf.ch03.payment.Product;

public class DiscountCharae extends Payment {

    /**
     * 规约类型要大写
     */
    private  Double discount;

    /**
     *
     * @param discount
     */
    public DiscountCharae(double discount){
        /**
         * 基本类型给对象类型是拆箱
         */
        this.discount = discount;
    }

    @Override
    public double pay(Product p, int money) {
        double d = p.getPrice()*p.getNum()*discount;
        double a = money-d;
        System.out.println("实收："+money);
        System.out.println("找零："+a);
        return a;
    }
}
