import java.util.Scanner;

enum colour{
    red, blue, yellow, green;
}

enum day{
    monday, tuesday, thursday, friday;
}

public class Enum {
    public static void main (String[] args){

       colour red = colour.red;

       System.out.println(red);


       day start = day.monday;
       System.out.println(start);

    }
}