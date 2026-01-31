public class Inheritance {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.running();
        h.shouting();
    }
}

class Animal{
    void shouting(){
        System.out.println("Shouting");
    }
}

class Horse extends Animal{
    void running(){
        System.out.println("Horse is running");
    }
}