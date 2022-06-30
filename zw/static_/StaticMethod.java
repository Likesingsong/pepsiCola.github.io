package zw.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("小王");
        Stu stu1 = new Stu("小李");
        stu.payFee(1000);
        stu1.payFee(1500.5);
        Stu.showFee();
    }
}

class Stu{
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public void payFee(double fee_){
        fee += fee_;
    }
    //当使用static修饰一个方法时,那么这个方法就是静态方法

    public static void showFee(){
        System.out.println("fee = " + fee);
        //静态方法只可以访问静态属性\变量
        //this.name ---不能访问非静态成员
    }

}