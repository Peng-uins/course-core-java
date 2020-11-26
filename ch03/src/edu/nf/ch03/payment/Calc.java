package edu.nf.ch03.payment;

public class Calc extends Payment {
    @Override
    public double pay(Product p,int money) {
        double m = money-p.getPrice()*p.getNum();
        System.out.println("购买了："+p.getName()+"，数量："+p.getNum()+",应收："+p.getPrice()*p.getNum()+",实收："+money);
        return m;
    }
}
