package zw.practice;

public class MethodTest {
    public static void main(String[] args) {
        int x = 1, y = 9;
        int[] a = {1, 4, 3, 8, 9};
        int[] b = new int[5];
        System.out.println(b[1]);
        getMax(x, y);
        getArrMax(a);
    }

    public static void getMax(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void getArrMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }

}
