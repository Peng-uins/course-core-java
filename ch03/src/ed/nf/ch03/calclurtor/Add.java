package ed.nf.ch03.calclurtor;

//继承抽象类就要实现抽象类的全部方法
public class Add extends Calc {
    @Override
    public double add(double a, double b) {
        //传入两个参数并相加然后返回给调用的人
        return a+b;
    }
}
