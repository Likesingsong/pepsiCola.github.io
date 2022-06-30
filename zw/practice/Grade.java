package zw.practice;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        //
        int[] scores = new int[6];
//		System.out.println(scores.length);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个评委的打分:");
            scores[i] = scanner.nextInt();
        }
        int temp, sum = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
            sum += scores[i];
        }

        double result = (sum - scores[0] - scores[scores.length - 1]) * 1.0 / (scores.length - 2);
        System.out.println("最低分:" + scores[0]);
        System.out.println("最高分:" + scores[scores.length - 1]);
        System.out.println("平均分:" + result);
    }
}
