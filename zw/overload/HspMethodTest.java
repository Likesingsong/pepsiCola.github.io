package zw.overload;

public class HspMethodTest {
    public static void main(String[] args) {
        HspMethod hsp = new HspMethod();
        System.out.println("nums = " + hsp.sum());
        int[] nums = {4, 5, 6};
        System.out.println("nums = " + hsp.sum(nums));
    }

}

class HspMethod {
    /**
     * 1、如果方法名称相同,功能大致相同,但是参数的个数不同 --->使用可变参数化
     * 2、int... 表示接受的是可变参数，类型是int
     * 3、使用可变参数时,可以当做数组来使用， 即 nums 当作数组来使用
     * 4、可变参数可以是数组
     */
    public int sum(int... nums) {
        System.out.println("接受的参数是:" + nums.length);
        int res = 0;
        for (int num : nums) {
            res += num;
        }
        return res;
    }
}
