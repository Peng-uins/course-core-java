package edu.nf.ch03.payment.impl;

import edu.nf.ch03.payment.Payment;
import edu.nf.ch03.payment.Product;

public class RebateCharge extends Payment {

    /**
     * 满利润条件
     */
    private  Double moneyCondition;

    /**
     * 返利的金额
     *
     */
    private  Double returnMoney;

    public RebateCharge() {
    }

    public RebateCharge(Double moneyCondition, Double returnMoney) {
        this.moneyCondition = moneyCondition;
        this.returnMoney = returnMoney;
    }

    @Override
    public double pay(Product p, int money) {
        double d = p.getPrice()*p.getNum();
        if(d >= moneyCondition){
            d =  d-returnMoney;
            System.out.println("实收："+d);
        }
        System.out.println("找零："+(money-d));
        return d;
    }
}
