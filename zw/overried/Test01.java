package zw.overried;

public class Test01 {

    public static void main(String[] args) {
        /**
         * 方法重写的注意事项
         * 1、子类方法的参数，方法名称要和父类的完全一样
         * 2、子类方法的返回类型和父类方法的返回类型一样
         *    或者是父类返回类型的子类
         * 3、子类方法不能缩小父类访问方法的访问权限---默认的访问权限是private
         */
        Dog dog = new Dog();

        dog.cry();
    }
}
