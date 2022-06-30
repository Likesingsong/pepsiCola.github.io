package zw.practice;

abstract class animal {          //定义了一个动物的抽象类
    String name;
    int age;

    abstract public void cry(); //定义了动物叫声的方法
}

class Dog extends animal {
    @Override
    public void cry() {
        System.out.println("汪汪汪...");
    }
}

class Cat extends animal {
    @Override
    public void cry() {
        System.out.println("喵喵喵...");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        animal ani;
        ani = new Dog();
        ani.cry();
        System.out.println("-----------");
        ani = new Cat();
        ani.cry();
    }
}
