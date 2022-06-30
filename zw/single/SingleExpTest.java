package zw.single;


public class SingleExpTest {

    public static void main(String[] args) {
        singleExp s1 = singleExp.getInstance();
        singleExp s2 = singleExp.getInstance();
        singleExp s3 = singleExp.getInstance();
        singleExp s4 = singleExp.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println((s1 == s4));
    }
}
