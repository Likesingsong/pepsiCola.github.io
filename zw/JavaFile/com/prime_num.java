package code.JavaFile.com;
/*
 * 输出指定范围内的素数
 */

public class prime_num
{
    public static void main(String[] args) {
        
        for(int i = 101; i < 200; i++)
        {
            //信号位
            boolean flag = true;
            //判断当前数字是否为素数
            for(int j = 2; j < i; j++)
            {
                if(i % j ==0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i + "\t");
            }
        }
    }
}
