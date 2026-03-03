/*
Input 1 :
Sarah
Output 1 :
Welcome, Sarah!
Input 2 :
Micheal
Output 2 :
Welcome, Micheal!
*/

import java.util.Scanner;

public class stringinput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        System.out.println("Welcome, " +name+ "!");
    }
}