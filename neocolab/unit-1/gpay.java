/*
Input 1 :
350.25
Output 1 :
Please Gpay Rs.350.25
Thanks, Visit us again!
Input 2 :
1200.59
Output 2 :
Please Gpay Rs.1200.59
Thanks, Visit us again
*/

import java.util.Scanner;

public class gpay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double total = sc.nextDouble();
        
        System.out.println("Please Gpay Rs."+total);
        System.out.println("Thanks, Visit us again!");
    }
}