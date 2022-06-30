package zw.xuetang9;

import java.util.Scanner;

public class KingOfFighter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //随机数字
        //Math.random();  [0.0,1.0)
        //(int)(Math.random()*1000) % 10; [0,9]
        //设置一个15-20范围的随机数
        // [a,b]之内的随机数， Math.random()*任意数 % a + (b-a+1);
        //int number = (int) (Math.random() * 100) % 16 + 5;
        //1.让双方选名字
        System.out.println("请输入角色的名字:");
        String userName = sc.next();
        String ComputerUserName = "草雉";
        System.out.println("电脑玩家已选择就绪！");
        System.out.println(userName + " VS " + ComputerUserName);
        //2.初始化双方的参数(体力值默认100)
        int hp1 = 100, hp2 = 100;
        int attack1 = 0, attack2 = 0;
        System.out.println("按任意键开始...");
        sc.nextLine();
        sc.nextLine();
        //3.使用循环模拟对战过程
        while (hp1 > 0 && hp2 > 0) {
            attack1 = (int) (Math.random() * 1000) % 16 + 10;
            attack2 = (int) (Math.random() * 1000) % 16 + 10;

            //玩家先攻击
            hp2 -= attack1;
            System.out.println(userName + "攻击了" + ComputerUserName + ",造成了" + attack1 + "点伤害.");
            if (hp2 <= 0) {
                break;
            }
            hp1 -= attack2;
            if (hp1 <= 0) {
                break;
            }
            System.out.println(ComputerUserName + "攻击了" + userName + ",造成了" + attack2 + "点伤害.");
        }
        //4.输出最终结果
        System.out.println("KO！");
        System.out.println("玩家名称\t\t血量");
        if (hp1 > hp2) {
            System.out.println(userName + "\t\t\t" + hp1);
        } else
            System.out.println(ComputerUserName + "\t\t\t" + hp2);
    }
}
