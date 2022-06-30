package zw.Car;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("=============");
        Car c1 = new Car("宝马", 45);
        System.out.println(c1.name);
        System.out.println(c1.price);
        c1.goWith("奔驰");
    }
}
