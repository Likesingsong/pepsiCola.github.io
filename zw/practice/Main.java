package Study_day_02;

public class Main {
    static String num = "";
    static int[] flag = new int[10];
    static int sum = 0;

    public static void main(String[] args) {

        fun(0, num);
        System.out.println(sum / 2);
    }

    static void fun(int n, String num) {
        if (n == 9) {
            insert(num);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (flag[i] == 0) {
                flag[i] = 1;
                fun(n + 1, num + i);
                flag[i] = 0;
            }
        }
    }

    static void insert(String num) {
        for (int i = 1; i < 9; i++) {
            String left = num.substring(0, i);
            String right = num.substring(i, 9);
            int res = Integer.parseInt(left) * Integer.parseInt(right);
            if (check(res, num)) {         //�������Ľ���Ƿ��о�λ��ͬ���������
                sum++;
            }
        }
    }

    static boolean check(int result, String num) {
        int[] Resflag = new int[10];
        Resflag[0] = 1;
        String s = String.valueOf(result);
        if (s.length() != 9) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(s.substring(i, i + 1));
            if (Resflag[n] == 0) {
                Resflag[n] = 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
