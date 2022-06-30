package zw.polymorphic.poly_exersice;

public class DynamicBinding {
    public static void main(String[] args) {
        //Java的重要特性----动态绑定
        //对于对象 a ：他的编译类型是A，运行类型是B
        A a = new B();   //向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

/**
 * java的动态绑定机制：
 * 1、当调用对象的方法时，该方法会和该对象的内存地址/运行类型绑定
 * 2、当调用对象的属性时，没有动态绑定机制，哪里声明哪里使用
 */

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }
}

class B extends A {
    public int i = 20;

    public int getI() {
        return i;
    }
    //当调用对象的方法时，该方法会和该对象的内存地址/运行类型绑定
//    public int sum(){
//        return i + 20;
//    }
    //当调用对象的属性时，没有动态绑定机制，哪里声明哪里使用
//    public int sum1(){
//        return i + 10;
//    }
}

