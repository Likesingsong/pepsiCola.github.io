package code.JavaFile.com;

public class MethodDemo1 {
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire("米国",2);
    }
    //方法重载
    public static void fire(){
        fire("米国");
    }
    public static void fire(String location){
        fire(location,1);
    }
    public static void fire(String location, int num){
        System.out.println("默认发射"+num+"枚武器给"+location+"~~~~");
    }
}
