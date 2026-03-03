/*
Input 1 :
4
The movie has a complex narrative but is visually stunning.
Output 1 :
Recent Review Rating: 4 stars
Review Details: The movie has a complex narrative but is visually stunning.
Input 2 :
5
An incredible film with mind-blowing sequences and outstanding performances.
Output 2 :
Recent Review Rating: 5 stars
Review Details: An inc
*/
import java.util.Scanner;
public class string {
public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            sc.nextLine(); //because nextLine() directly go to the next line and that is empty and that does not take input of our string.
            String review = sc.nextLine();
            
            System.out.println("Recent Review Rating: " +n+ " stars");
            System.out.println("Review Details: " + review);
    }
}