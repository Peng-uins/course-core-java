package edu.nf.ch03.payment;

/**
 * 抽象类
 */
public abstract class Payment {
    /**
     * 抽象方法
     */
    public abstract double pay(Product p,int money);

    public void output(double money){
        System.out.println("找零:"+money);
    }
}
