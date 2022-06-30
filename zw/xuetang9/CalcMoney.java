package zw.xuetang9;

public class CalcMoney {
    public static void main(String[] args) {
        //确定循环三要素
        int year = 2015;
        double money = 800;
        while (money <= 2000) {
            money *= 1.25;
            year++;
        }
        System.out.println("交易将会在" + year + "年超过2000亿元~" + money + "亿元");
    }
}
