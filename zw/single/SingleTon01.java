package zw.single;


public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend myGF = GirlFriend.getInstance();
        System.out.println(myGF);
    }
}
//有一个类，GirlFriend
//只能有一个女朋友
class GirlFriend{
    private final String name;

    /**
     * 如何保证只创建一个对象[单例模式---饿汉式]
     * 步骤
     * 1、将构造器私有化
     * 2、在类内部直接创建对象
     * 3、提供一个公有的static方法，返回对象(向外暴露)
     */
    //为了能在静态方法中返回gf对象，需要将其修饰为static
            //对象通常是重量级的对象，饿汉式可能造成创建了对象但是没有使用的情况，资源浪费
    private static final GirlFriend gf = new GirlFriend("小闫");
    private GirlFriend(String name) {
        this.name = name;
    }
    /*
    使用public可以创造很多的GirlFriend对象，因此选择使用private(构造器私有)
    public GirlFriend(String name) {
        this.name = name;
    }
    */
    //共有的static方法
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
