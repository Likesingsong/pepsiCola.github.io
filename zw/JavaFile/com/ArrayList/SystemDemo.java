package code.JavaFile.com.ArrayList;

import java.util.ArrayList;

public class SystemDemo {
    public static void main(String[] args) {
        ArrayList <Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖申克的救赎》", 8.8, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣"));
        movies.add(new Movie("《阿甘正传》", 9.8, "汤姆.汉克斯"));
        for (int i = 0; i < movies.size(); i++) {
            Movie movieTemp = movies.get(i);
            System.out.println("片名:" + movieTemp.getName());
            System.out.println("评分:" + movieTemp.getScore());
            System.out.println("主演:" + movieTemp.getActor());
        }
    }
}
