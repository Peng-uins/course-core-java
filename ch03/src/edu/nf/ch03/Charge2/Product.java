package edu.nf.ch03.Charge2;

public class Product {
    private String name;
    private int num;
    private double price;

    public Product() {
    }

    public Product(String name, int num, double price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
