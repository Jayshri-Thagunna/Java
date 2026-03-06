
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deviationtwo {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int digit = sc.nextInt();

        List<Integer> digits = new ArrayList<>();

        while ( digit > 0) {
            int n = digit % 10;
            digits.add(n);
            digit = digit/10;
        }
        
        for (int i = 0; i < digits.size(); i++) {
            System.out.println("Nums " + i + ": " + digits.get(i));
        }

        sc.close();

    }
}
