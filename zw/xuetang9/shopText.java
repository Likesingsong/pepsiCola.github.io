package zw.xuetang9;

import java.util.Scanner;

public class shopText {
    public static void main(String[] args) {
        //定义一个购物车对象
        goods shopcarGoods[] = new goods[100];
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("请您选择如下命令：");
            System.out.println("添加商品：add");
            System.out.println("查询商品：query");
            System.out.println("修改商品：updata");
            System.out.println("结算商品：pay");
            System.out.println("清空购物车：clear");
            System.out.println("退出购物车：exit");
            System.out.println("请您输入命令：");

            String command = scanner.next();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("退出购物");
                System.out.println("祝您购物愉快，欢迎下次光临！");
                break;
            } else {
                switch (command) {

                    case "add":
                        //添加商品
                        addGoods(shopcarGoods);
                        break;

                    case "query":
                        //查询商品
                        queryGoods(shopcarGoods);
                        break;

                    case "updata":
                        //修改成绩
                        updataGoods(shopcarGoods);
                        break;

                    case "pay":
                        //支付商品
                        payGoods(shopcarGoods);
                        break;

                    case "clear":
                        //清空购物车
                        clearBuycar(shopcarGoods);
                        break;

                    default:
                        System.out.println("您输入的命令有错误!");

                }
            }
        }

    }

    public static void clearBuycar(goods[] shopcarGoods) {
        for (int i = 0; shopcarGoods[i] != null; i++) {
            shopcarGoods[i] = null;
        }
    }

    //结算所有商品
    public static void payGoods(goods[] shopcarGoods) {
        //
        float sum = 0;
        for (int i = 0; shopcarGoods[i] != null; i++) {
            sum += shopcarGoods[i].buyNumber * shopcarGoods[i].price;
        }
        System.out.println("您所有商品的的价格为：" + sum);
    }

    //修改商品
    public static void updataGoods(goods[] shopcarGoods) {
        //
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你想修改的商品的编号");
        int sq = sc.nextInt();
        System.out.println(shopcarGoods[sq].id + "\t" + shopcarGoods[sq].nameString + "\t" + shopcarGoods[sq].price + "\t" + shopcarGoods[sq].buyNumber);
        System.out.println("您需要修改的是：(name、price、buyNumber、all、exit)");

        String command = sc.next();

        switch (command) {
            case "name":
                System.out.println("请修改该物品的名称：");
                shopcarGoods[sq].nameString = sc.next();
                break;

            case "price":
                System.out.println("请修改该物品的价格：");
                shopcarGoods[sq].price = sc.nextDouble();
                break;

            case "BuyNumber":
                System.out.println("请修改该物品的数量：");
                shopcarGoods[sq].buyNumber = sc.nextInt();
                break;

            case "all":
                System.out.println("请修改该物品的名称：");
                shopcarGoods[sq].nameString = sc.next();
                System.out.println("请修改该物品的价格：");
                shopcarGoods[sq].price = sc.nextDouble();
                System.out.println("请修改该物品的数量：");
                shopcarGoods[sq].buyNumber = sc.nextInt();
                break;
            case "exit":
                System.out.println("退出购物车修改！");
                break;
            default:
                System.out.println("您输入的命令有误!");
        }
        System.out.println("修改成功!");


    }

    //修改商品
    public static void queryGoods(goods[] shopcarGoods) {
        //
        System.out.println("序号\t商品名称\t商品价格\t商品数量");
        for (int i = 0; shopcarGoods[i] != null; i++)
            System.out.println(shopcarGoods[i].id + "\t" + shopcarGoods[i].nameString + "\t" + shopcarGoods[i].price + "\t" + shopcarGoods[i].buyNumber);
    }

    //添加商品
    public static void addGoods(goods[] shopcarGoods) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入商品的名称");
        String shopName = sc.next();
        System.out.println("请输入商品的价格");
        double pi = sc.nextDouble();
        System.out.println("请输入商品的数量");
        int num = sc.nextInt();


        goods sGoods = new goods();
        sGoods.nameString = shopName;
        sGoods.price = pi;
        sGoods.buyNumber = num;

        //遍历购物车
        for (int i = 0; i < shopcarGoods.length; i++) {
            if (shopcarGoods[i] == null) {
                shopcarGoods[i] = sGoods;
                shopcarGoods[i].id = i + 1;
                System.out.println(sGoods.nameString + "添加成功");
                break;
            }
        }


    }
}
