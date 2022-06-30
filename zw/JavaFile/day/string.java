package code.JavaFile.day;

public class string {
    public static void main(String[] args) {
        //关于字符串的一些内容
        String s1 = new String("abc");  //这里实际上是创建了两个对象
        //"abc"是在常量池中的常量
        String s2 = "abc";
        System.out.println(s1 == s2);
        //equals比较只关心字符串的内容
        System.out.println(s1.equals(s2));
    }
}
