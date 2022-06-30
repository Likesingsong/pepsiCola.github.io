package zw.single;
//单例模式----懒汉式
public class singleExp {
    /**
     * 将构造器私有
     */
    private singleExp() {

    }

    /*
     * 合理暴露,创建一个静态的成员变量，不进行初始化
     * */
    //建议将他的对象私有，防止有人误调空对象
    private static singleExp instance;

    /**
     * 获取一个方法，让外界可以来获取调用一个对象
     */
    public static singleExp getInstance() {
        if (instance == null) {
            instance = new singleExp();
        }
        return instance;
    }
}
