package code.JavaFile.com;

import java.util.Scanner;

public class getsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("1~"+num+"的数字之和是:"+getSum(num));
    }
    public static int getSum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        return sum;
    }
}
