package edu.nf.ch03.Charge2;

/**
 * 实现多个接口用‘，’隔开
 */
public class NormalCharge implements Charge {
    @Override
    public double charge(ChargeParams params) {
        double d = params.getProduct().getPrice()*params.getProduct().getNum();
        System.out.println("应收："+d);
        System.out.println("实收："+params.getMoney());
        return params.getMoney()-d;
    }

    @Override
    public void say() {

    }
}
