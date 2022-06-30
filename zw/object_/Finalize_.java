package zw.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car BMW = new Car("宝马");
        /**
         * 当某个对象没有任何引用的时候,则jvm就认为这个对象是一个垃圾对象
         * 就会使用垃圾回收机制来销毁该对象,在销毁对象之前,会调用finalize方法
         */
        BMW = null; //此时对象指向空，jvm认为这个对象是垃圾，垃圾回收机制就会回收这个垃圾对象
        //此时如果程序员不重写finalaze方法, 就会调用Object类的finalize方法，即默认处理
        //可以选择重写finalaze方法，实现自己的逻辑
        System.gc();    //主动触发垃圾回收器
        System.out.println("程序退出!");

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //重写finalize方法
    @Override
    protected void finalize() throws Throwable {
        //实现自己的逻辑
        System.out.println("我们销毁了" + name);
        System.out.println("我们释放了一些资源...");

    }
}
