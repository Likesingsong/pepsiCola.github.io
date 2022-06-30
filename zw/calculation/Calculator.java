package zw.calculation;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = InputAndCheckP(sc);
        double mr = InputAndCheckMr(sc);
        int m = InputAndCheckM(sc);
        double payment = calculate(p, mr, m);
        printDetails(p, mr, payment, m);
        sc.close();
    }

    static double InputAndCheckP(Scanner sc) {
        System.out.println("请输入本金");
        double p = sc.nextDouble();
        if (p <= 0) {
//            System.out.println("贷款金额必须大于0");
            //throw new 异常类型("提示信息");
            throw new IllegalArgumentException("贷款金额必须大于0");
        }
        return p;
    }

    static double InputAndCheckMr(Scanner sc) {
        System.out.println("请输入年利率");
        double yr = sc.nextDouble();
        if (yr < 1.0 || yr > 36.0) {
//            System.out.println("年利率必须是 1 ~ 36");
            throw new IllegalArgumentException("年利率必须是 1 ~ 36");
        }
        return yr / 12.0 / 100;
    }

    static int InputAndCheckM(Scanner sc) {
        System.out.println("请输入还款月数");
        int m = sc.nextInt();
        if (m > 360 || m < 1) {
//            System.out.println("贷款月数必须是1 ~ 360");
            throw new IllegalArgumentException("贷款月数必须是1 ~ 360");
        }
        return m;
    }


    /**
     * 打印每月的还款详情
     *
     * @param p       本金
     * @param mr      月利率
     * @param payment 本月还款
     * @param m       月数
     */
    static void printDetails(double p, double mr, double payment, int m) {
        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            p -= payPrincipal;
            System.out.print("月份:" + (i + 1));
            System.out.print("\t本月还款:" + NumberFormat.getCurrencyInstance().format(payment));
            System.out.print("\t偿还本金:" + NumberFormat.getCurrencyInstance().format(payPrincipal));
            System.out.print("\t偿还利息:" + NumberFormat.getCurrencyInstance().format(payInterest));
            System.out.println("\t剩余利息:" + NumberFormat.getCurrencyInstance().format(p));
        }
        System.out.println("总还款金额:" + NumberFormat.getCurrencyInstance().format(payment * m));

    }

    /**
     * 计算以等额本息方式的每月还款
     *
     * @param p  本金
     * @param mr 月利率
     * @param m  还款月数
     * @return 没月还款金额
     */
    static double calculate(double p, double mr, int m) {
        double pow = Math.pow(1 + mr, m);
        return p * mr * pow / (pow - 1);
    }
}
