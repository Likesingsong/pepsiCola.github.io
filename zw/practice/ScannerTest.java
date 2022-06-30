package zw.practice;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();
//        使用三目运算符比较身高
        int tempheight = height1 > height2 ? height1 : height2;
        int maxheight = tempheight > height3 ? tempheight : height3;
        System.out.println("这三个和尚身高最高的是:" + maxheight);
    }
}
