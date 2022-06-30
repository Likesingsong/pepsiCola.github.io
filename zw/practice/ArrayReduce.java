package zw.practice;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        while (true) {
            System.out.println("已知数组的长度为:" + arr.length);
            System.out.println("是否缩减数组？ 1.是 2.否 3.查看数组");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1 && arr.length != 1) {
                int[] arrNew = new int[arr.length - 1];
                for (int i = 0; i < arr.length - 1; i++) {
                    arrNew[i] = arr[i];
                }
                arr = arrNew;
            } else if (choice == 2 || arr.length == 1) {
                System.out.println("数组不能再缩减，已退出！");
                break;
            } else if (choice == 3) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}
