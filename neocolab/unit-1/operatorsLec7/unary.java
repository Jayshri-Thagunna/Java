/*
Input 1 :
12
Output 1 :
Unary Plus: 12
Unary Minus: -12
Input 2 :
629
Output 2 :
Unary Plus: 629
Unary Minus: -629
*/

import java.util.Scanner;

public class unary{
	public static void main(String[] args) {
		//Type your code here
		Scanner sc = new Scanner(System.in);
		    
		    int n = sc.nextInt();
		    
		    System.out.println("Unary Plus: " + (+n));
		    System.out.println("Unary Minus:  " + (-n));
		
	}
}