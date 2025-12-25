import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        // for(int i=0;i<=10;i=i+2){
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
    
        // for(int i=0;i<=n;i++){
        //     System.out.println(i);
        // }
        for(int i=n;n>=0;n--){
            System.out.println(n);
        }
        System.out.println("Happy New Year");
    }
}
