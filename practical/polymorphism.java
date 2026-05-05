class animal {
    protected String name = "Animal";

    public void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends animal {
    private String breed = "Golden Retriever";

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void makeSound(int times) {
        for(int i = 0; i < times; i++) {
            System.out.print("Woof! ");
        }
        System.out.println();
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.makeSound(3);
    }
}