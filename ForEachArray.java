import java.util.*;
public class ForEachArray {
    public static void main(String[] args) {
        // String[] cars = {"Volvo", "BMW", "Tata", "Ford"};

        // for(String i:cars){
        //     System.out.println(i);
        // }

/* 1Q)Get the n students marks from the user and print the avg of all the students 

    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        System.out.println(sum);
        System.out.println(sum/n);
 */

/*2Q)Get the n students marks from the user and print the highest marks. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students: ");
            
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            max = Math.max(max, sc.nextInt());

        System.out.println(max);


    }
}