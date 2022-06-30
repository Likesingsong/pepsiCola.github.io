package code.JavaFile.com;

import java.util.Scanner;

public class telTest {
    public static void main(String[] args) {
        /**
         * 加密手机号
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("input a telnumber:");
        String tel = sc.next();
        sc.close();
        String before = tel.substring(0,3);
        String after = tel.substring(7);
        String newtel = before + "****" + after;
        System.out.println(newtel);
    }
}
