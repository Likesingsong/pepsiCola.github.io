package zw.static_;

public class StaticCodeBlock {
    /**
     * 创建一个对象时，在一个类的调用顺序是   静态代码块和静态属性初始化-->普通代码块和普通属性的初始化-->构造方法
     * 1、调用静态代码块和静态属性初始化
     * (注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按照他们的顺序调用)
     * 2、调用普通代码块和普通属性的初始化
     * (注意：普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
     * 3、调用构造方法
     */
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{
    /**
     * 构造器
     */
    public A(){
        System.out.println("A构造器被调用...");
    }
    /**
     * 都是static属性  因此执行顺序和位置有关系
     */

    private static int a = getA();
    static {
        System.out.println("A 静态代码块");
    }

    public static int getA(){
        System.out.println("getA被调用...");
        return 100;
    }


    /**
     * 都是普通属性  因此执行顺序和位置有关系
     */
    //普通代码
    private int b = getB();
    //普通代码块
    {
        System.out.println("A 普通代码块");
    }
    public int getB(){
        System.out.println("getB被调用...");
        return 20;
    }

}
