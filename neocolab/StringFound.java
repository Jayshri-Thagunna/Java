/*
Input 1 :
The quick brown fox
quick
Output 1 :
Found Substring: quick
Input 2 :
The quick brown fox
the quick
Output 2 :
Substring not found
*/

import java.util.Scanner;

public class StringFound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String mainString = sc.nextLine();
        String target = sc.nextLine();

        // Check substring
        if (mainString.contains(target)) {
            System.out.println("Found Substring: " + target);
        } else {
            System.out.println("Substring not found");
        }

        sc.close();
    }
}