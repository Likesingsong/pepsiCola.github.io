package zw.static_;

public class CodeBlockExercise {
    public static void main(String[] args) {
        //无参构造器
        CodeTest ct = new CodeTest();
        /*
          输出结果：
          1、静态代码块和静态属性初始化调用的优先级一样，按照他们定义的顺序调用
          2、普通代码块和普通属性初始化调用的优先级一样，按照他们定义的顺序调用
          3、调用构造器
          静态成员sample2初始化
          static代码块执行
          sample1成员初始化
          CodeTest默认构造器被调用
        */
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }

    public Sample() {
        System.out.println("Sample的默认构造函数被调用");
    }
}

class CodeTest{
    //普通成员
    Sample sample1 = new Sample("sample1成员初始化");
    //静态成员
    static Sample sample2 = new Sample("静态成员sample2初始化");
    //静态代码块
    static {
        System.out.println("static代码块执行");
        if(sample2 == null){
            System.out.println("sample2 is null");
        }
    }
    //无参构造器
    public CodeTest() {
        System.out.println("CodeTest默认构造器被调用");
    }
}
