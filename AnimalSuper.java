// Parent class
class Animal {
    String name = "Animal";

    // Parent constructor
    Animal() {
        System.out.println("This is Animal constructor");
    }

    // Parent method
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    Dog() {
        // calling parent constructor
        super();
        System.out.println("This is Dog constructor");
    }

    void display() {
        // accessing parent variable
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);

        // calling parent method
        super.sound();
    }
}

// Main class
public class AnimalSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}