package zw.practice;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        //
        int[] scores = new int[6];
//		System.out.println(scores.length);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("�������" + (i + 1) + "����ί�Ĵ��:");
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
        System.out.println("��ͷ�:" + scores[0]);
        System.out.println("��߷�:" + scores[scores.length - 1]);
        System.out.println("ƽ����:" + result);
    }
}
