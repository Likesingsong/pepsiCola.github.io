package zw.practice;

public class HanoiTower {
    public static void main(String[] args) {
        Tower newT = new Tower();
        newT.move(3, 'A', 'B', 'c');
    }

}

class Tower {
    //方法
    //num表示要移动盘的个数，'a','b','c'表示三个柱子
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "移动到" + c);
        } else {
            //如果有多个盘，则可以看作两个盘
            /**
             * 1、先移动所有的盘到 b,再借助 c
             * 2、把最下面的盘移动到 c
             * 3、在把 b 柱子的盘子移动到 c
             */
            move(num - 1, a, c, b);
            System.out.println(a + "移动到" + c);
            move(num - 1, b, a, c);

        }
    }
}