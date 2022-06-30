package zw.interface_.interface_demo;

public class AnonymousInterfaceTest {
    public static void main(String[] args) {
        Isay say = new Isay() {
            @Override
            public void sayHello() {
                System.out.println("hello,java");
            }
        };
        say.sayHello();
        Class<? extends Isay> classRuntime = say.getClass(); //The Class object that represents the runtime class of this object.
        System.out.println(classRuntime);
    }

}

/**
 * 创建匿名的接口实现类对象：临时创建一个没有命名的接口实现类
 * 错觉：不提供接口实现的情况下，直接new一个接口实例
 * 好处：代码简约
 */
interface Isay {
    void sayHello();
}
/*
class IsayImp implements Isay{  //非匿名用法

    @Override
    public void sayHello() {
        System.out.println("hello,java");
    }
}*/

