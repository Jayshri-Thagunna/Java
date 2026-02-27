// Interface 1
interface A {
    void display();
}

// Interface 2
interface B {
    void show();
}

// Child class implementing both interfaces
class C implements A, B {

    public void display() {
        System.out.println("Display method from A");
    }

    public void show() {
        System.out.println("Show method from B");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();
    }
}