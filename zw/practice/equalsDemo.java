package zw.practice;

import java.util.Scanner;

public class equalsDemo {
    public static void main(String[] args) {
        String okName = "zhangwei";
        String okPassword = "628719";

        System.out.println("登录名称：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("登陆密码：");
        String password = sc.next();
        if (name.equals(okName) && password.equals(okPassword)) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("用户名或密码输入错误！");
        }

        String sk = "ABC123";
        String sj = "abc123";
        if (sk.equalsIgnoreCase(sj)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
