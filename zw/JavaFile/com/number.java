package code.JavaFile.com;

public class number {
    public static void main(String[] args) {
        //判断一个整数是奇数还是偶数
        check(11);
        System.out.println("--------");
        check(50);
    }

    private static void check(int i) {
        if(i % 2 == 0)
        {
            System.out.println(i + "是偶数");
        }else
        {
            System.out.println(i + "是奇数");
        }
    }
}
