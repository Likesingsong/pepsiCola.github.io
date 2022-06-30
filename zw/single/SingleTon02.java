package zw.single;

/**
 * 演示懒汉式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        /*
          和饿汉式不同的是，只有用到类的对象时才会使用，而使用类的其他属性时，不会构造用不到的对象
         */
        Cat cat = Cat.getInstance();
        System.out.println(cat);
        //第二次调用
        System.out.println("==========");
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);
        /*
            输出结果
            构造器被调用...
            Cat{name='小可爱'}
            ==========
            Cat{name='小可爱'}
            可以看出：只有第一次创建对象，第二次会返回第一次的对象
          */
    }
}

//希望在程序运行过程中，只能创建一个Cat对象
class Cat{
    /**
     * 步骤
     * 1、构造器私有化
     * 2、定义一个static静态属性对象
     * 3、提高一个公共的static方法，可以返回一个Cat对象
     * 4、只有当用户使用getInstance时，才会创建对象，
     *    而在第二次使用时，就会返回之前创建的对象
     */
    private final String name;    //不需要设置为静态
    private static Cat cat = null;
    //构造器私有化
    private Cat(String name) {
        System.out.println("构造器被调用...");
        this.name = name;
    }
    public static Cat getInstance(){
        //在多线程时，会有破坏单例模式的风险
        if(cat == null){
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}