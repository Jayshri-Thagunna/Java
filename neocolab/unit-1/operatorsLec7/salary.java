/* 
Input 1 :
2500.75
3000.40
2700.98
Output 1 :
Rs. 8202.13
Input 2 :
10075.00
15000.70
28085.69
Output 2 :
Rs. 53161.39
*/

public class salary {
   public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        
        double pam = sc.nextDouble();
        double jlim = sc.nextDouble();
        double dwight = sc. nextDouble();
        
        double total = pam + jlim + dwight;
        
        System.out.printf("Rs. %.2f",total);
        
    }
}