import java.util.Scanner;

abstract class Book
{

    protected String title;
    protected  String author;

    public Book(String t,String a){
        title=t;
        author=a;
    }
    public abstract void display();


}

class MyBook2 extends Book{
    protected int price;

    public MyBook2(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Mybook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook2(title, author, price);
        book.display();
    }
}