package zw.exception;

public class TestException {
    public static void main(String[] args) {
        String[] greet = {"Hello,world", "No,I mean it", "Hello,World"};
        try {
            for (int i = 0; i < greet.length + 1; i++) {
                System.out.println(greet[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        } finally {
            System.out.println("处理完毕!");
        }
    }
}
