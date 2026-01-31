package OOPS;



abstract class Fruit {
    abstract void eat();

    void drink() {
        System.out.println("Drink Fruit Juice");
    }
}

class Orange extends Fruit {
    void eat(){
        System.out.println("Eat the Orange");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Fruit f=new Orange();
        f.eat();
        f.drink();
    }
}
