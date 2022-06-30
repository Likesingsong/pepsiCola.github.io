package zw.practice;


import java.time.LocalDate;

public class datelocal {
    public static void main(String[] args) {
        LocalDate s = LocalDate.of(2022, 1, 1);
        System.out.println(s.getMonth());
        System.out.println(s.getMonthValue());
    }
}
