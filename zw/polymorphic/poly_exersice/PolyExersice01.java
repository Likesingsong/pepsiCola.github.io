package zw.polymorphic.poly_exersice;

public class PolyExersice01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int i = 5;
//        boolean b = (boolean) i;  //ClassCastException,int --> boolean
        Object obj = "hello";       //多态--向上转型
        String str = (String) obj;  //向下转型
        System.out.println(str);
        System.out.println("===============");
        Object obj1 = new Integer(5);   //向上转型
//        String str1 = (String) obj1; //ClassCastException，int --> String
        Integer str2 = (Integer) obj1;        //向下转型
        System.out.println(str2);
    }
}
