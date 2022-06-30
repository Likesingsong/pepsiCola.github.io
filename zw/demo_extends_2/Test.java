package zw.demo_extends_2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 25, "476班");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClassname());
    }
}
