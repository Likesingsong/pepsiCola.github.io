package code.JavaFile.com;

import java.util.Random;
import java.util.Scanner;

public class doublecolorball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] luckynumber = createLuckNumber();
        
        System.out.println("幸运池已经打开,按任意键继续~~~");
        sc.next();
        int[] usersnumber = userInputNumbers();
        sc.close();
        judge(luckynumber, usersnumber);
    }
    //打印信息
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1? arr[i] : arr[i]+",");
        }
        System.out.println("]");
    }
    //创建双色球数字
    public static int[] createLuckNumber(){
        //定义一个动态数组
        int[] number = new int[7];
        //随机产生n个不相同的数字
        Random r = new Random();
        
        for(int i = 0; i < number.length - 1; i++)
        {
            while(true){
                //产生一个1~33之间的随机数
                int data = r.nextInt(33) + 1;
                //由于不重复，所以要判断这个数字是否已经存在数组中
                boolean flag = true;
                for(int j = 0; j < i; j++)
                {
                    if(data == number[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    number[i] = data;
                    break;
                }
            }
        }
        //为第七个位置生成蓝色球的号码
        number[number.length-1] = r.nextInt(16) + 1;
        return number;
    }
    //输入用户的双色球数字
    public static int[] userInputNumbers() {
        int[] number = new int[7];
        //由用户输入自己的幸运数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的6位红色球数字(不重复):");
        for (int i = 0; i < number.length - 1; i++) {
            System.out.println("请输入您的第"+(i+1)+"个红色球的数字");
            number[i] = sc.nextInt();
        }
        //录入蓝色球号码
        System.out.println("请输入您的蓝色球号码:");
        number[number.length - 1] = sc.nextInt();
        sc.close();
        return number;
    }
    //判断中奖情况
    public static void judge(int[] luckynumber, int[] usersnumber)
    {
        int redhitnumbers = 0;
        boolean bluehit = false;
        //判断命中了多少个红球
        for (int i = 0; i < usersnumber.length; i++) {
            for (int j = 0; j < luckynumber.length; j++) {
                if(usersnumber[i] == luckynumber[j])
                {
                    redhitnumbers++;
                }
            }
        }
        //判断是否命中蓝球
        bluehit = usersnumber[usersnumber.length-1] == luckynumber[luckynumber.length-1] ? true : false;

        //输出号码信息
        System.out.println("本期号码是:");
        printArr(luckynumber);
        System.out.println("您输入的号码是:");
        printArr(usersnumber);
        System.out.println("恭喜您命中了"+redhitnumbers+"个红球~");
        if(bluehit){
            System.out.println("恭喜您猜中了蓝色球!!!");
        }else{
            System.out.println("很遗憾蓝色球与您擦肩而过~~");
        }

        //判断中奖情况
        if(bluehit == true && redhitnumbers < 3){
            System.out.println("恭喜您,中了5元小奖!");
        }else if(bluehit == true && redhitnumbers == 3
                || bluehit == false && redhitnumbers == 4){
            System.out.println("恭喜您,中了10元小奖!");
        }else if(bluehit == true && redhitnumbers == 4
                || bluehit == false && redhitnumbers == 5){
            System.out.println("恭喜您,中了200元!");
        }else if(bluehit == true && redhitnumbers == 5){
            System.out.println("恭喜您,中了3000元大奖!");
        }else if(bluehit == false && redhitnumbers == 6){
            System.out.println("恭喜您,中了500万超级大奖!");
        }else if(bluehit == true && redhitnumbers == 6){
            System.out.println("恭喜您,中了1000万巨奖!可以开始享受人生,诗和远方!!!");
        }else {
            System.out.println("感谢您为福利事业做出的突出贡献！！");
        }
    
    }

}
