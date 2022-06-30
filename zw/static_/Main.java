package zw.static_;

public class Main {
    /**
     * 深入理解main方法    public static void main(String[] args)
     * 1、main方法时虚拟机调用
     * 2、Java虚拟机需要调用类的main方法,所以该方法的权限必须是public
     * 3、Java虚拟机在执行main方法时不需要创建对象,所以该方法必须是static
     * 4、该方法接收String类型的数据参数，数组中保存执行Java命令时传递给所运行类的参数
     * 5、java 执行的程序 参数1、参数2、参数3...
     * @param args
     */
    public static void main(String[] args) {
        //遍历args数组
        for (int i = 0; i < args.length; i++) {
            //可以在edit configurations中的program arguments设置参数
            System.out.println("第x个参数" + args[i]);
        }
    }
}
