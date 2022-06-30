package code.JavaFile.com;
/*
 * 完成数字数组的复制
 */
public class copyArr {
    public static void main(String[] args) {
        int[] sum1 = {55,666,77,41,27,33};
        int[] sum2 = new int[sum1.length];
        Copy(sum2, sum1);
        printArr(sum1);
        printArr(sum2);
    }
    public static void Copy(int[] arr1,int[] arr2)
    {
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = arr2[i];
        }
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1? arr[i] : arr[i]+",");
        }
        System.out.println("]");
    }
}
