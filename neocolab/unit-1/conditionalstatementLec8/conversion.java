/*
Input 1 :
1
5.0
Output 1 :
5.00 inches is equal to 12.70 centimeters.
Input 2 :
2
8.6
Output 2 :
8.60 pounds is equal to 3.90 kilograms.
Input 3 :
3
12.5
Output 3 :
12.50 gallons is equal to 47.32 liters.
*/

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int choice = sc.nextInt();
        double unit = sc.nextDouble();
        
        if(choice == 1) {
            double cemi = unit * 2.54;
            System.out.printf("%.2f inches is equal to %.2f centimeters.", unit,cemi);
        }else if(choice == 2){
            double kilo = unit * 0.453592;
            System.out.printf("%.2f pounds is equal to %.2f kilograms.",unit,kilo);
        }else if(choice == 3){
            double lit = unit * 3.78541;
            System.out.printf("%.2f gallons is equal to %.2f liters.",unit,lit);
        }
    }
}
