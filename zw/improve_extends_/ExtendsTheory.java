package zw.improve_extends_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();

    }
}

class GrandPa {  //父类的父类
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {   //父类
    String name = "大头爸爸";
    int age = 39;
}

class Son extends Father {       //子类
    String name = "大头儿子";
}