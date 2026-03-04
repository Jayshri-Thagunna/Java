/*
Input 1 :
10 5
Output 1 :
10
Input 2 :
78 -89
Output 2 :
78
Input 3 :
-56 -35
Output 3 :
-35
*/
import java.util.Scanner;

public class maxno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int max = (a > b) ? a : b;
        
        System.out.println(max);
    }
}