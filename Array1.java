import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of elements: ");
        int n = sc.nextInt();

        // int[] arr = new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        //     arr[1]=100; //Updates index 2 with value 100
        // }
        // System.out.println(arr[0]);


        // String[] cars = {"BMW", "Tata", "Ford", "Thar"};
        // //cars [3]="Fortuner";
        // int n=cars.length;

        // for(int i=0;i<n;i++){
        //     System.out.println(cars[i]);
        // }
        // int sum =0;
        // for(int i=0;i<n;i++){
        //     sum = sum + marks[i];
        // }
        //System.out.println(sum);



        // int[] marks = new int[n];
        // int sum = 0;

        // for(int i=0;i<n;i++){
        //     marks[i] = sc.nextInt();
        //     sum = sum + marks[i];
        // }
        // System.out.println(sum);

        int sum = 0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
