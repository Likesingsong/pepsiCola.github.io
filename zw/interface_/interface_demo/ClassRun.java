package zw.interface_.interface_demo;

public class ClassRun {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Class<?> classRun = b.getClass();
        System.out.println(classRun);
    }
}

class A {
    public A() {
    }
}

class B extends A {

}

