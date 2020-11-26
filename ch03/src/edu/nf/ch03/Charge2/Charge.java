package edu.nf.ch03.Charge2;

/**
 * 接口只能定义常量和抽象方法
 * 一个类可以同时实现多个接口
 * 接口也可以继承接口，但是只能继承一个
 */
public interface Charge extends Myinf {

    /**
     * 常量的命名必须全部大写有多个单词用'_'隔开
     * 并且final和static是不需要加上，编译器在编译时候会自动补全
     */
    public static final  String CLASS_NAME = "aaaaa";
    /**
     * 接口中定义的抽象方法不需要加上abstract，编译器在编译时候会自动加
     * @param params
     * @return
     */
    public abstract double charge(ChargeParams params);
}
