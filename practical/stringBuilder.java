
public class stringBuilder {
    public static void main(String[] args){
        String greeting = "Hello";
        greeting = greeting + " World!";
        System.out.println("String result: " + greeting);

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is");
        sb.append(" Awesome!");

        System.out.println("StringBuilder result: " + sb.toString());
    }
}