import java.util.Scanner;

class BookOperation{
    String title;
    String author;
    double price;
    double discount;

    BookOperation(String title, String author, double price, double discount){
        this.title = title;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }

    void displayDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(discount);
    }

    double calculateDiscount(){
        double sum = price + discount;
        return sum;
    }

}

public class Book{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();
        double discount = sc.nextDouble();

        BookOperation d = new BookOperation(title, author, price, discount);

        d.displayDetails();
    
        System.out.printf("%.2f", d.calulateDiscount());
    }
}