package code.JavaFile.com;

import java.util.Scanner;

/*
 * 需求是：计算不同季节机票的价格  
 */

 public class Price
 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("机票原价:");
         double price = sc.nextDouble();
         System.out.println("月份:");
         int month = sc.nextInt();
         System.out.println("舱位类型(1.头等舱,2.经济舱):");
         int chance = sc.nextInt();
         sc.close();
         double lastPrice = calc(price,month,chance);
         if(lastPrice != -1)
            System.out.println("您当前购买机票的价格是:"+lastPrice);
         
     }
     /*     定义一个方法计算机票价格     */
     public static double calc(double money, int month, int c)
     {
         //首先判断月份是淡季还是旺季
         if(month >= 5 && month <= 10)
         {  //旺季
             switch(c)
             {
                case 1:
                    money *= 0.85;
                    break;
                case 2:
                    money *= 0.9;
                    break;
                default:
                    System.out.println("您输入的舱位不正确~");
                    money = -1;
             }
         }
         //淡季
         else if(month == 11 || month == 12 || month >= 1 && month <= 4)
         {
             switch(c)
             {
                case 1:
                money *= 0.65;
                break;
            case 2:
                money *= 0.7;
                break;
            default:
                System.out.println("您输入的舱位不正确~");
                money = -1;
             }
         }else{
             System.out.println("月份出错~");
             money = -1;
         }

         return money;
     }
 }