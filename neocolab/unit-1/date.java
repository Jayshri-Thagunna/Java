/*
input 1 :
Alice
2024-08-15
Output 1 :
Hi Alice,
Just a reminder: Your next renewal is on 2024-08-15.
Don't forget to renew!
Input 2 :
Shraddha
2024-09-21
Output 2 :
Hi Shraddha,
Just a reminder: Your next renewal is on 2024-09-21.
Don't forget to renew!
*/

import java.util.Scanner;

public class date{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String name = sc.nextLine();
    String date = sc.nextLine();
    
    System.out.println("Hi "+name+ ",");
    System.out.println("Just a reminder: Your next renewal is on "+date+ ".");
    System.out.println("Don't forget to renew!");
    }
}