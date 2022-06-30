package zw.practice;

interface Book {
    String Bookname();

    double getPrice();

    String editor();

    String data();
}

class bookone implements Book {
    @Override
    public String Bookname() {
        return "《植物崛起》";
    }

    @Override
    public double getPrice() {
        return 26.7;
    }

    @Override
    public String editor() {
        return "星陨落";
    }

    @Override
    public String data() {
        return "2021/7";
    }
}


public class BookText {

    public void sellBook(Book book) {
        System.out.println("书名:" + book.Bookname() + ",单价:" + book.getPrice() + ",作者:" + book.editor() + ",日期:" + book.data());
    }

    public static void main(String[] args) {
        BookText sBook = new BookText();
        sBook.sellBook(new bookone());
    }
}
