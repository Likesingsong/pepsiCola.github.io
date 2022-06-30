package zw.Car;

public class Car {
    String name;
    double price;

    public Car() {
        System.out.println("无参构造器被触发~~");
    }

    public Car(String name, double price) {
        System.out.println("有参构造器被调用~~");
        this.name = name;
        this.price = price;
    }

    public void goWith(String name) {
        System.out.println(this.name + "正在和" + name + "进行比赛~~");
    }

}
