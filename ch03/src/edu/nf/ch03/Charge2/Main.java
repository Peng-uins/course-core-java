package edu.nf.ch03.Charge2;

public class Main {
    public static void main(String[] args) {
        ChargeParams cp = new ChargeParams(10000.0,0.8,4000.0,500.0,new Product("手机",2,4000));
        //Charge c = new NormalCharge();
        Charge c = new DiscountCha();
        System.out.println("找零："+c.charge(cp));
    }
}
