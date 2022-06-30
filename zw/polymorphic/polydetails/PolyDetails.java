package zw.polymorphic.polydetails;

public class PolyDetails {
    public static void main(String[] args) {
        B b = new B();
        //a 的编译类型是A 运行类型是B
        A a = new B();
        System.out.println(b instanceof B);//true
        System.out.println(b instanceof A);//true
        System.out.println(a instanceof B);//true
        /**
         * instanceof 判断的是对象的运行类型是否为某个类或是某个类的子类
         */
    }
}

class A {
}   //父类

class B extends A {
}     //子类
