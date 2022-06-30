package code.JavaFile.com;

import java.util.Random;
/*
 * 定义一个方法随机生成任意长度的验证码
 */
public class createCode{
    public static void main(String[] args) {
        String yanzhengma = getString(8);
        System.out.println(yanzhengma);
    }
    public static String getString(int n)
    {
        String code = "";
        Random r = new Random();
        for(int i = 0; i < n; i++)
        {
            //随机生成一个字符
            int type = r.nextInt(3);    //0,1,2
            switch(type)
            {   //大写字符
                case 0:
                    char ch1 = (char)(r.nextInt(26) + 65);
                    code += ch1;
                    break;
                //小写字符
                case 1:
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
                //数字
                case 2:
                    code += r.nextInt(10);
                    break;
            }

        }
        return code;

    }
}