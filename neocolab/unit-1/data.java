/*
Input 1 :
GPT-4
100
64
2.567
true
Output 1 :
Model Name: GPT-4
Training Epochs: 100
Batch Size: 64
Learning Rate: 2.57
Training Successful: true
Input 2 :
BERT
50
32
7.015
false
Output 2 :
Model Name: BERT
Training Epochs: 50
Batch Size: 32
Learning Rate: 7.01
Training Successful: f
*/



import java.util.Scanner;

public class data{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String model = sc.nextLine();
        int training = sc.nextInt();
        int batch = sc.nextInt();
        float rate = sc.nextFloat();
        boolean status = sc.nextBoolean();
        
        System.out.println("Model Name: " +model);
        System.out.println("Training Epochs: " +training);
        System.out.println("Batch Size: "+batch);
        System.out.printf("Learning Rate: %.2f",rate); //%.2f because the output is round-off value of rate
        System.out.println("Training Successful: "+status);
    }
}
