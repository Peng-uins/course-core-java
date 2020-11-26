package edu.nf.ch03.teacher;

/**
 * JDK1.8之后可以定义默认方法
 * 默认方法就是在接口中的一种默认实现
 * 实现类可以针对自身的业务需求要重写
 * 这些默认方法
 * 还可以定义静态方法
 */
public interface Teacher2 {

    /**
     * 定义默认的方法,是有方法体的，
     */
    default void say(){
        System.out.println("上课点名");
    }

    /**
     * 可以重写也可以不操作，不强制子类要重写这个方法
     */
    //abstract编译器会自动添加
   default void code(){

   };

    public void lesson();

    public void homework();

    public  void a();
}
