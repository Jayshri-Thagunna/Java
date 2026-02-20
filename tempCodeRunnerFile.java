public class Inheritance {
    public static void main(String[] args) {
        Car mycar = new Car("Honda", 200, 4);
        mycar.start();
        mycar.display();
    }
};

class Vehical {
    public:
        string brand;
        int speed;

        Vehical(string brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        void start() {
            Sytstem.out.println(brand + "is starting...");
        }

        void display() {
            System.out.println("Brand: "+brand);
            System.out.println("Speed: "+speed);
        }
};

class Car extends Vehical {
    public:
        int doors;

        Car(string brand, int speed, int doors) {
            this.doors = doors;
        }

        void displaycarinfo() {
            display();
            System.out.println("Number of doors: "+doors);
        }
};

