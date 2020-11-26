package ed.nf.ch03.calclurtor;

public abstract class Calc {
    /**
     计算方法有不同的实现
     */
    //abstract抽象的方法，抽象的方法是不朽要实体的可以不写后面的{}
    public abstract double add(double a,double b);

    /**
     公共的显示输出方法，将计算结果显示到控制台
     */
    public void display(double result){
        System.out.println("结果"+result);
    }
}
