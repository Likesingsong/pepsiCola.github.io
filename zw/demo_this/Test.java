package zw.demo_this;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("小明", "好好上学校");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("小王");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }

}
