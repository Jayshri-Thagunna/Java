/*
Input 1 :
14 28
Output 1 :
true
Input 2 :
15 29
Output 2 :
false
Input 3 :
50 25
Output 3 :
false
*/

import java.util.Scanner;

public class bool{
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean result = (a * 2 == b);
        
        System.out.println(result);
        
    }
}