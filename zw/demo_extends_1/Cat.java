package zw.demo_extends_1;

public class Cat extends Animal {

    public Cat() {
        super();        //默认存在的
        System.out.println("子类无参构造器被触发~~");
    }

    public Cat(String name) {
        super();        //默认存在的
        System.out.println("子类有参构造器被触发~~");
    }
}
