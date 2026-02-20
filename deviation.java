public class deviation {
    public static void main(String[] args) {
    int a1 = 3, a2 = 4, a3 =5;
    int sum = a1 + a2 + a3;     // 3+4+5 =12

    // min no and max no
    System.out.println("The max no is: "+a3);
    System.out.println("The min no is: "+a1);


    System.out.println("The sum is: " +sum);


    // avg for each digit
    int count = 3;
    
    int avg = sum/count;
    System.out.println("The avg of these three numbers: " +avg);

    // Deviation
    // avg-a1, avg -a2, avg-3
    int dev1 = avg-a1;
    int dev2 = avg-a2;
    int dev3 = avg-a3;

    System.out.println("The deviation of  first number: " +dev1);
        System.out.println("The deviation of second number: " +dev2);
            System.out.println("The deviation of third numbers: " +dev3);


    }
    
}
