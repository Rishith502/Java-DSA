import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while(n>0){
            System.out.println(n);
            n--;
        }
        System.out.println("Happy New Year");
    }
}
