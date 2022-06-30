package zw.demo_extends_2;

public class Student extends People {
    private String Classname;

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String classname) {
        Classname = classname;
    }


    public Student() {
    }

    public Student(String name, int age, String Classname) {
        /**
         * 一定会访问父类的无参构造器，如果父类中提供了有参构造器
         * 1.养成为类提供无参构造器的方法
         * 2.在子类中通过super将子类有父类的数据进行连接
         */
        super(name, age);
        this.Classname = Classname;        //子类中也有成员变量的话，要在本类中进行初始化
    }

}
