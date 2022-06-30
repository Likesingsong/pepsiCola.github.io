package code.JavaFile.day;
import java.util.Scanner;
public class ifTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a score:");
        int score  = sc.nextInt();
        sc.close();
        if(score == 100)
        {
            System.out.println("奖励一辆BWM");
        }else if(score > 80 && score <= 99){
            System.out.println("奖励一台iphone X");
        }else if(score >= 60 && score <= 80){
            System.out.println("奖励一台ipad");
        }else{
            System.out.println("nothing");
        }

    }
}
