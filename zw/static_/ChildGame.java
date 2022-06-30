package zw.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("白骨精");
        child1.join();
        Child child2 = new Child("黄风怪");
        child2.join();
        Child child3 = new Child("白象精");
        child3.join();
        Child.ChildSum();
    }
}

class Child{
    private String name;
    //类变量也叫静态变量\静态属性
    //定义一个静态变量 count ,该变量最大的特点是会被Child所有的对象实例所共享
    //static类变量是在类加载的时候就已经生成
    private static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏...");
        count++;
    }
    public static void ChildSum(){
        System.out.println("一共有" + count + "个小孩在玩游戏...");
    }


}
