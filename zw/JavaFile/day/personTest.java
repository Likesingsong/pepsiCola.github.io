package code.JavaFile.day;

public class personTest {

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "小明";
        a.age = 17;
        Person b;
        //此时b 和 a 指向了同一块内存
        b = a;
        b.age = 10;
        System.out.println(a.age);
    }


}

class Person{
    String name;
    int age;
}