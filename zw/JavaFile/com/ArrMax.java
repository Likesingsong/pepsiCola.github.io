package zw.JavaFile.com;

public class ArrMax
{
    public static void main(String[] args) {
        int [] ages = {23,19,25,78,34};
        int max = getArrayMaxNum(ages);
        System.out.println("最大值是:" + max);
        System.out.println("--------------");
        int [] ages1 = {31,32,99,78,34};
        int max1 = getArrayMaxNum(ages1);
        System.out.println("最大值是:" + max1);
    }

    private static int getArrayMaxNum(int[] ages) {
        int max = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (max  < ages[i]) {
                max = ages[i];
            }
        }
        return max;
    }
}