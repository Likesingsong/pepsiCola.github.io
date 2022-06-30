package zw.demo.extends_exercise;

public class Test01 {
    public static void main(String[] args) {
        B b = new B();  //输出结果为
        /**
         * a
         * b name
         * b
         */
    }
}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }

    B(String name) {
        /**
         * 子类的构造器都会默认调用父类的无参构造器
         * super();
         */
        System.out.println("b name");
    }
}