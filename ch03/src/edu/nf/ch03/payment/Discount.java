package edu.nf.ch03.payment;

public class Discount extends Payment {
    private double discount;

    public Discount() {
    }

    public Discount(double discount) {
        this.discount = discount;
    }

    @Override
    public double pay(Product p, int money) {
        if(p.getNum()*p.getPrice() >= 7000){
            double m = money-p.getPrice()*p.getNum()*discount;
            System.out.println("购买了："+p.getName()+"，数量："+p.getNum()+",折扣："+discount+",应收："+p.getPrice()*p.getNum()*discount+",实收："+money);
            return m;
        }else{
            Calc c = new Calc();
            return c.pay(p,money);
        }
    }
}
