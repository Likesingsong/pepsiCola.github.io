package zw.demo.extends_exercise;

public class PC extends Computer {
    private String brand;   //品牌

    //继承设计的基本思想：父类的构造器完成父类属性的初始化，而子类完成子类特有属性的初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC的信息是");

        //调用父类的方法输出PC信息
        System.out.println(details() + ",brand is " + getBrand());

    }
}
