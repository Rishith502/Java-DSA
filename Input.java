import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a+b);

        //String str = sc.next();  //only takes next word or one word in a line
        // String str = sc.nextLine(); //takes whole line
        // System.out.println(str);

        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println(length * breadth);
    }
}
