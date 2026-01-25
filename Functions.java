import java.util.*;
public class Functions {
    // static void func(){
    //     System.out.println("It executes when function is called.");
    // }

    // public static void main(String[] args) {
    //     func();
    // }


    // static void sum(int a, int b){
    //     System.out.println(a+b);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     sum(a,b);
    // }



    static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //System.out.println(add(x,y));
        int z = add(x,y);
        System.out.println(z);
    }
}
