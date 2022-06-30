package zw.static_;

public class StaticCodeBlockExtends {
    public static void main(String[] args) {
        /*
          在创建一个子类对象时，他们的静态属性、普通属性、构造方法调用的顺序
          1、父类的静态代码块和静态属性(优先级一样，按定义顺序执行)
          2、子类的静态代码块和静态属性(优先级一样，按定义顺序执行)
          3、父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
          4、父类的构造方法
          5、子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
          6、子类的构造方法
         */
        new B1();
        /*
          执行结果
          静态属性getValueA1
          A1的静态代码块...
          静态属性getValueB1
          B1的静态代码块...
          A1的普通代码块...
          普通属性getValueA2
          A1构造器
          B1的普通代码块...
          普通属性getValueB2
          B1构造器
         */
    }
}
class A1{   //父类
    private static int a1 = getValueA1();
    //静态代码块
    static {
        System.out.println("A1的静态代码块...");
    }
    //普通代码块
    {
        System.out.println("A1的普通代码块...");
    }
    public int a2 = getValueA2();
    public static int getValueA1(){
        System.out.println("静态属性getValueA1");
        return 10;
    }
    public int getValueA2(){
        System.out.println("普通属性getValueA2");
        return 20;
    }
    //无参构造器
    public A1() {
        System.out.println("A1构造器");
    }
}
class B1 extends A1{
    private static int b1 = getValueB1();
    //静态代码块
    static {
        System.out.println("B1的静态代码块...");
    }
    //普通代码块
    {
        System.out.println("B1的普通代码块...");
    }
    public int b2 = getValueB2();
    public static int getValueB1(){
        System.out.println("静态属性getValueB1");
        return 30;
    }
    public int getValueB2(){
        System.out.println("普通属性getValueB2");
        return 40;
    }
    //无参构造器
    public B1() {
        System.out.println("B1构造器");
    }
}
