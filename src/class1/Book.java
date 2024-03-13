package class1;
import java.util.Scanner;
public class Book {
    String title;
    String author;
    int price;
    public void setTitle(String title)  {
        this.title = title;
    }

    public void setAuthor(String author)  {
        this.author = author;
    }

    public void setPrice(int price)  {
        this.price = price;
    }
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title");
        this.title = input.next();
        System.out.println("Enter author");
        this.author = input.next();

        System.out.println("Enter price");
        this.price = input.nextInt();
    }
    public void display() {
        System.out.println("Name: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

}
