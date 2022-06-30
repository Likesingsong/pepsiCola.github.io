package zw.demo.extends_exercise;

public class Test02 {
    public static void main(String[] args) {
        C1 c = new C1();
        /**
         * 输出结果是:
         * a
         * hahaha我是B类的有参构造器
         * 我是C类的有参构造
         * 我是C类的无参构造器
         */
    }
}

class A1 {
    public A1() {
        System.out.println("我是A类");
    }
}

class B1 extends A {
    public B1() {
        System.out.println("我是B类的无参构造器");
    }

    public B1(String name) {
        System.out.println(name + "我是B类的有参构造器");
    }
}

class C1 extends B1 {
    public C1() {
        this("hello");
        System.out.println("我是C类的无参构造器");
    }

    public C1(String name) {
        super("hahaha");
        System.out.println("我是C类的有参构造");
    }
}
