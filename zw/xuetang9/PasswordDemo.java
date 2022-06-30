package zw.xuetang9;

import java.util.Scanner;

public class PasswordDemo {
    public static void main(String[] args) {
        final String PASSWORD = "123abc";
        Scanner input = new Scanner(System.in);
        String password = null;
        String username = "";
        //循环
        int i = 0;
        while (i < 3) {
            System.out.println("请输入账号:");
            username = input.next();
            System.out.println("请输入密码:");
            password = input.next();
            if (PASSWORD.equals(password) && "root".equals(username)) {
                System.out.println("登录成功！");
                break;
            }
            ++i;
            System.out.println("账号与密码不匹配,请重新输入！剩余[" + (3 - i) + "]次");
            if (i == 3) {
                System.out.println("错误次数已达三次，退出！");
                System.exit(0);
            }
        }
    }
}
