import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Marks: ");
        // int marks = sc.nextInt();
        // if(marks>=90){
        //     System.out.println("Grade: A");
        // }
        // else if(marks>=80){
        //     System.out.println("Grade: B");
        // }
        // else if(marks>=70){
        //     System.out.println("Grade: C");
        // }
        // else if(marks>=60){
        //     System.out.println("Grade: D");
        // }
        // else{
        //     System.out.println("Grade: F");
        // }

        // int a=12;
        // int b=62;
        // int c=25;

        // if(a>b && a>c){
        //     System.out.println(a +" "+"is Greater");
        // }
        // else if(b>a && b>c){
        //     System.out.println(b +" "+"is Greater");
        // }
        // else{
        //     System.out.println(c +" "+"is Greater");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three numbers: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest number is: "+ a);
        }
        else if(b>a && b>c){
            System.out.println("Largest number is: "+ b);
        }
        else{
            System.out.println("Largest number is: "+ c);
        }
    }
}
