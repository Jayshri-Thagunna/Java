import java.util.Scanner;

class Equation {
    double a;
    double b;
    double c;
    
    void inputCoefficients() {
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }
    }
    
    void solveEquation() {
        if(a == 0){
            System.out.println("a is zero");
        }else{
            double x = (c-b)/a;
            System.out.printf("x = %.1f\n", x);
        }
        
        if(b == 0){
            System.out.println("b is zero");
        }else{
            double y =(c-a)/b;
            System.out.printf("y = %.1f" ,y);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.inputCoefficients();
        equation.solveEquation();
    }
}