/*
input 1 :
5
3
7
Output 1 :
Result of (5 & 3 | 7) ^ (~5 & 3 | 7): 0
Input 2 :
-1
6
5
Output 2 :
Result of (-1 & 6 | 5) 
*/

import java.util.Scanner;

public class calculation{
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        int result = (a&b|c)^(~a&b|c);
        System.out.println("Result of (" +a+ " & " +b+ " |" +c+ ") ^ (~" +a+ " &" +b+ " |" +c+ "): " +result);
    }
}