/*Single File Programming Question
Input 1 :
Hello, World!
o
x
Output 1 :
Hellx, Wxrld!
Input 2 :
Jurassic Park
s
$
Output 2 :
Jura$$ic Park

*/
import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String str = sc.nextLine();     // main string
        char target = sc.next().charAt(0);     // character to replace
        char replacement = sc.next().charAt(0); // new character

        // Replace characters
        String modified = str.replace(target, replacement);

        // Output
        System.out.println(modified);

        sc.close();
    }
}
