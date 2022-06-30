package zw.practice;

class SqueueDmoe {
    String name;

    public SqueueDmoe(String n) {
        name = n;
    }

    public void printwithSleep() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(name);
        }
    }
}


public class SleepTest {
    public static void main(String[] args) {
        String s[] = {"一", "起", "向", "未", "来"};
        for (int i = 0; i < s.length; i++) {
            new SqueueDmoe(s[i]).printwithSleep();
            System.out.print("!");
        }
    }
}
