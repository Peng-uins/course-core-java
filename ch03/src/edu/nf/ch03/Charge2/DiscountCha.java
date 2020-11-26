package edu.nf.ch03.Charge2;

public class DiscountCha implements Charge , Myinf {
    @Override
    public double charge(ChargeParams params) {
        double d = params.getProduct().getPrice()*params.getProduct().getNum()*params.getDiscount();
        System.out.println("应收："+d);
        System.out.println("实收："+params.getMoney());
        return params.getMoney()-d;
    }

    @Override
    public void say() {

    }
}
