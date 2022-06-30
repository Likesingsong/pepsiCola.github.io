package zw.practice;

public class Recursion {
    public static void main(String[] args) {
        Test test = new Test();
        int rsc = test.factorial(5);
        System.out.println("rsc = " + rsc);
        int res = test.fibonacci(7);
        System.out.println("res = " + res);
        int peachNum = test.eatPeach(1);
        System.out.println("peachNum = " + peachNum);
    }

}

class Test {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else
            System.out.println("输入错误");
        return -1;
    }

    /**
     * 猴子吃桃
     */
    public int eatPeach(int day) {
        if (day == 10)
            return 1;
        else if (day >= 1 && day <= 9) {
            return (eatPeach(day + 1) + 1) * 2;
        } else {
            System.out.println("天数只能是1~10天");
            return -1;
        }
    }
}