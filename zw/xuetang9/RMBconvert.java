package zw.xuetang9;

import java.util.Scanner;

public class RMBconvert {
    /**
     * 将给定的钱数转换为对应的人民货币的数量
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner inputMoney = new Scanner(System.in);
        System.out.println("请输入钱的数目:");
        double money = inputMoney.nextDouble();
        //处理元
        int yuan = (int) money, numofBaiyuan = 0, numofShiyuan = 0, numofWuyuan = 0,
                numofYiyuan = 0;
        while (yuan > 0) {
            if (yuan >= 100) {
                numofBaiyuan = yuan / 100;
                yuan %= 100;
            } else if (yuan >= 10) {
                numofShiyuan = yuan / 10;
                yuan = yuan % 10;
            } else if (yuan >= 5) {
                numofWuyuan++;
                yuan = yuan % 5;
            } else {
                numofYiyuan = yuan;
                break;
            }
        }
        //处理角
        int jiao = (int) (money * 10) % 10;
        int numofWujiao = 0, numofYijiao = 0;
        if (jiao > 5) {
            numofWujiao++;
            numofYijiao = jiao - 5;
        } else
            numofYijiao = jiao;
        System.out.println("100元纸币数量:" + numofBaiyuan);
        System.out.println("10元纸币数量:" + numofShiyuan);
        System.out.println("5元纸币数量:" + numofWuyuan);
        System.out.println("1元纸币数量:" + numofYiyuan);
        System.out.println("5角纸币/硬币数量:" + numofWujiao);
        System.out.println("1角纸币/硬币数量:" + numofYijiao);

    }
}
