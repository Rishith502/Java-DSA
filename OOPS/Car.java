package OOPS;

public class Car {
    String brand;
    int speed=120;

    Car(String brand , int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Car Brand: " +  brand + ", Speed: " + speed + " km/h");
    }

    void start() {
        System.out.println("Car is starting");
    }


    public static void main(String[] args) {
        Car c= new Car("Toyota", 120);
        //Car myCar = new Car();
        // myCar.brand = "Toyota";
        // myCar.speed = 120;

        c.display();
        c.start();
        // System.out.println(myCar.speed);
    }
}