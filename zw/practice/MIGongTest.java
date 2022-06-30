package zw.practice;

public class MIGongTest {
    public static void main(String[] args) {
        int[][] map = new int[8][8];
        //初始化迷宫
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || i == 7 || j == 0 || j == 7) {
                    map[i][j] = 1;
                }
            }
        }
        //设置障碍物
        map[1][4] = 1;
        map[2][0] = map[2][1] = map[2][2] = map[2][4] = map[2][6] = 1;
        map[3][4] = map[3][6] = 1;
        map[5][2] = map[5][3] = map[5][4] = map[5][5] = 1;
        map[6][5] = 1;
        //打印迷宫
        System.out.println("=======当前地图情况=======");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        T t = new T();
        t.findWay(map, 1, 1);
        System.out.println("===找路的情况如下===");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    //使用递归回溯的方法
    /*
    1、方法findWay是为了找出迷宫的路径
    2、如果找到就返回true,没有找到就返回false
    3、i, j 表示老鼠的位置
    4、由于是递归找路，首先要找到退出递归的条件
        0：表示通路、 1：表示墙，不能通过  2：表示走过的路(且可以走)
        3：表示走过但是是死路
    5、当map[6][6] = 2,说明找到一条通路，可以结束程序，否则就继续找
    6、先确定一个找路的策略：下->右->上->左
    */

    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][6] == 2) { //说明找到了通路
            return true;
        } else if (map[i][j] == 0) {
            //假定可以走通
            map[i][j] = 2;
            //使用找路的策略,来确定该位置是否真的可以走通
            //下->右->上->左
            if (findWay(map, i + 1, j)) { //往下走
                return true;
            } else if (findWay(map, i, j + 1)) { //往右走
                return true;
            } else if (findWay(map, i - 1, j)) { //往上走
                return true;
            } else if (findWay(map, i, j - 1)) { //往左走
                return true;
            } else {
                map[i][j] = 3;  //上面都走不通，表示已走过且此路不通
                return false;
            }
        } else {
            return false;
        }
    }
}
