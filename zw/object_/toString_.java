package zw.object_;

public class toString_ {
    public static void main(String[] args) {
        /**
         * Object 的 toString 方法源码
         * getClass()--> 类的全类名(包名+类名)
         * Integer.toHexString(hashCode()) --> 将对象返回的哈希值转化为十六进制的字符串
         * public String toString() {
         *     return getClass().getName() + "@" + Integer.toHexString(hashCode());
         * }
         */
        Monster monster = new Monster("小妖怪", "巡山", 800);
        //===当直接输出一个对象时,对象会默认调用Object类的toString方法
        System.out.println("monster = " + monster);
        System.out.println("monster.hashCode() = " + "hashCode=" + monster.hashCode());
        //===当直接重写toString方法后,对象会调用重写的toString方法
        System.out.println(monster.toString());
        //在应用中我们会打印或者拼接对象，都会调用toString方法，因此我们需要重写toString方法
        //monster.toString();
    }
}

class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    //重写toString 方法(使用快捷键即可),目的是把对象的属性输出,程序可更改\定制
    @Override
    public String toString() {
        return "Monster:{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
