import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        // if(a>b){
        //     result = a;
        // }
        // else{
        //     result=b;
        // }
        result = (a>b) ? a : b;
        System.out.println("Result is:"+result);
    }
}
