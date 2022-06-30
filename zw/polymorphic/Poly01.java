package zw.polymorphic;

public class Poly01 {
    public static void main(String[] args) {
        Moster jackson = new Moster("jackson");
        Dog dog = new Dog("大黄");
        Bone bigBone = new Bone("大棒骨");
        Cat kitty = new Cat("kitty");
        Fish fish = new Fish("黄花鱼");
        jackson.feed(dog, bigBone);
        jackson.feed(kitty, fish);
    }
}
