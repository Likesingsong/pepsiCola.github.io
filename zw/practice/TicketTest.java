package zw.practice;

import java.util.Scanner;

public class TicketTest {

    public static void main(String[] args) {
        // 录入购买机票的信息
        Scanner sc = new Scanner(System.in);
        System.out.print("机票原价:");
        double price = sc.nextDouble();
        System.out.print("月份:");
        int month = sc.nextInt();
        System.out.print("舱位类型(头等舱、经济舱):");
        String type = sc.next();
        //调用方法
        double rc = calc(price, month, type);
        System.out.println("当前已购买机票的价格是: " + rc);
    }

    /*定义一个方法，计算不同月份飞机不同舱位的价格*/


    public static double calc(double money, int month, String type) {
        //判断是淡季还是旺季
        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "经济舱":
                    money *= 0.85;
                    break;
                case "头等舱":
                    money *= 0.9;
                    break;
                default:
                    System.out.println("您输入的舱位不正确~");
                    money = -1;//表示无法计算价格
                    break;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (type) {
                case "经济舱":
                    money *= 0.65;
                    break;
                case "头等舱":
                    money *= 0.7;
                    break;

                default:
                    System.out.println("您输入的舱位不正确~");
                    money = -1;//表示无法计算价格
                    break;
            }
        } else {
            System.out.println("您输入的月份有问题!");
            money = -1;
        }
        return money;
    }
}