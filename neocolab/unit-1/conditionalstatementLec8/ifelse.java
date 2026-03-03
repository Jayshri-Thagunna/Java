/*
Input 1 :
12
Output 1 :
Digit Sum: 3
The sum of the digits is less than 10.
Input 2 :
29
Output 2 :
Digit Sum: 11
The sum of the digits is not less than 10.
Input 3 :
55
Output 3 :
Digit Sum: 10
The sum of the digits is not less than 10.
Input 4 :
345
Output 4 :
Not a valid two-digit number.
*/

public class ifelse {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            int sum = 0;
        if(n >= 10 && n <= 99){
            while(n > 0){
            sum = sum + (n%10);
            n = n/10;
            }
            
        System.out.println("Digit Sum: "+sum);
        
        if(sum < 10){
            System.out.println("The sum of the digits is less than 10.");
        }else {
            System.out.println("The sum of the digits is not less than 10.");
        }
        
        }else{
            System.out.println("Not a valid two-digit number.");
        }
    }
}

