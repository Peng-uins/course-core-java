package ed.nf.ch03.calclurtor;

public class Main {
    public static void main(String[] args) {
        //Add是继承Calc的子类可以用父类来装(多态)
        Calc js = new Add();
        //创建一个变量存js调用的方法返回的值
        double result = js.add(1,2);
        //使用继承父类的方法输出到控制台
        js.display(result);
    }
}
