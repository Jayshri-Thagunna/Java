/*
Input 1 :
62
77
57
1
Output 1 :
Average Marks: 65.3
Input 2 :
98
95
92
2
Output 2 :
Highest Marks: 98.0
Input 3 :
46
52
50
3
Output 3 :
Lowest Marks: 46.0
*/
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        
        int choice = sc.nextInt();
        
        if(choice == 1) {
            double avg = (sub1 + sub2 + sub3) / 3.0;
            System.out.printf("Average Marks: %.1f", avg);
        } else if(choice == 2) {
           if(sub1 > sub2 && sub1 > sub3) {
               System.out.printf("Highest Marks: %.1f", (double)sub1);
           } else if(sub2 > sub1 && sub2 > sub3){
               System.out.printf("Highest Marks: %.1f", (double)sub2);
           } else {
               System.out.printf("Highest Marks: %.1f", (double)sub3);
           }
        } else {
            if(sub1 < sub2 && sub1 < sub3) {
            System.out.printf("Lowest Marks: %.1f", (double)sub1);
            }else if(sub2 < sub1 && sub2 < sub3) {
                System.out.printf("Lowest Marks: %.1f", (double)sub2);
            }else {
                System.out.printf("Lowest Marks: %.1f", (double)sub3);
            }
        }
        
    }
}


