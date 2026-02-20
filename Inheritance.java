class Vehical {
    String brand;
    int speed;

        Vehical(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        void start() {
            System.out.println(brand + " is starting...");
        }

        void display() {
            System.out.println("Brand: "+brand);
            System.out.println("Speed: "+speed);
        }
};

class Car extends Vehical {
        int doors;

        Car(String brand, int speed, int doors) {
            super(brand, speed);
            this.doors = doors;
            
        }

        void displaycarinfo() {
            display();
            System.out.println("Number of doors: "+doors);
        }
};

public class Inheritance {
    public static void main(String[] args) {
        Car mycar = new Car("Honda", 200, 4);
        mycar.start();
        mycar.display();
    }
}
