package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Horse h=new Horse();
        // h.running();
        // h.shouting();


        // Child obj=new Child();
        // obj.greet();
        // obj.display();
        // obj.show();

        // Cars myCar = new Cars();
        // myCar.start();
        // myCar.drive();
        // Bike b = new Bike();
        // b.start();
        // b.ride();

        // Bird bird = new Bird();
        // bird.fly();
        // bird.swim();
    }
}


//SINGLE INHERITANCE
// class Animal{
//     void shouting(){
//         System.out.println("Shouting");
//     }
// }

// class Horse extends Animal{
//     void running(){
//         System.out.println("Horse is running");
//     }
// }



// MULTILEVEL INHERITANCE

// class Grandparent{
//     void greet(){
//         System.out.println("Hello from Grandparent");
//     }
// }

// class Parent extends Grandparent{
//     void display(){
//         System.out.println("This is Parent Class");
//     }
// }

// class Child extends Parent{
//     void show() {
//         System.out.println("This is Child Class");
//     }
// }



//HIERARCHICAL INHERITANCE

// class Vehicle {
//     void start() {
//         System.out.println("Vehicle is starting...");
//     }
// }

// class Cars extends Vehicle {
//     void drive() {
//         System.out.println("Cars is driving...");
//     }
// }

// class Bike extends Vehicle {
//     void ride(){
//         System.out.println("Bike is riding...");
//     }
// }




//MULTIPLE INHERITANCE

// interface flyable{
//     void fly();
// }

// interface swimmable{
//     void swim();
// }

// class Bird implements flyable, swimmable {
//     public void fly(){
//         System.out.println("Bird can fly");
//     }

//     public void swim(){
//         System.out.println("Bird can swim");
//     }
// }


