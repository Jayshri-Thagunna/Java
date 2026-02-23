import java.util.*;

class ArrayRotator{
    int[] arr;
    int n;
    int m;


public ArrayRotator(int[] arr, int n, int m) {
        //type your code here
        
        this.arr = arr;
        this.n = n;
        this.m = m;
        
    }

    public void rotateRight() {
        //type your code here
        m = m%n;
        
        int[] temp = new int[n];
        int index = 0;
        
        for(int i = n-m; i<n; i++) {
            temp[index++] = arr[i];
        }
        
        for(int i = 0; i<n-m; i++) {
            temp[index++] = arr[i];
        }
        
        arr = temp;
        
    }

    public void display() {
        //type your code here
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        ArrayRotator ar = new ArrayRotator(arr, n, m);
        ar.rotateRight();
        ar.display();
    }
}