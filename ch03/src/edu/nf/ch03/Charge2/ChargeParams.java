package edu.nf.ch03.Charge2;

/**
 * 收费计算所需的参数对象
 */
public class ChargeParams {
    //用户支付金额
    private Double money;
    //折扣
    private Double discount;
    //满利条件
    private Double moneyCondition;
    //返利额
    private Double moneyReturn;

    private Product product;

    public ChargeParams() {
    }

    public ChargeParams(Double money, Double discount, Double moneyCondition, Double moneyReturn, Product product) {
        this.money = money;
        this.discount = discount;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public Double getMoney() {
        return money;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getMoneyCondition() {
        return moneyCondition;
    }

    public Double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setMoneyCondition(Double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public void setMoneyReturn(Double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
