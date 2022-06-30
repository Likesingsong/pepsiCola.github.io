package zw.polymorphic.poly_exersice;

public class PolyExersice02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        //访问属性看编译类型
        System.out.println(s.count);
        //运行方法就要按照查找关系，就要开始看对象的运行属性
        s.display();
        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();

    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}
