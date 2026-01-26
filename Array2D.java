import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        // int arr[][] = {
        //     {1,2,3},
        //     {2,3,4},
        //     {3,4,5}
        // };
        // System.out.println(arr[1][2]);


        //System.out.println("Enter the no of students and subjects: ");
        //Scanner sc = new Scanner(System.in);
        // int students = sc.nextInt();
        // int subjects = sc.nextInt();

        // int[][] marks = new int[students][subjects];

        // for(int i=0;i<students;i++){
        //     for(int j=0;j<subjects;j++){
        //         marks[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0;i<students;i++){
        //     for(int j=0;j<subjects;j++){
        //         System.out.print(marks[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

    // int students=sc.nextInt();
    // int[][] marks = new int[students][];
    // for(int i=0;i<students;i++){
    //     System.out.println("enter no of subjects for students i: ");
    //     int subs = sc.nextInt();
    //     marks[0]=new int [subs];
    //     marks[0][1] = 1;
    // }
    //     for(int i=0;i<students;i++){
    //         for(int j=0;j<students;j++){
    //             marks[i][j] = sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<students;i++){
    //         for(int j=0;j<students;j++){
    //             System.out.print(marks[i][j]+ " ");
    //         }
    //         System.out.println();
    //     }


    /*WRITE A PROGRAM TO FIND THE LARGEST ELEMENT IN A 2D ARRAY */
    System.out.println("Enter no of rows and cols:");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] arr = new int[rows][cols];

    // int max = 0;

    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         arr[i][j]=sc.nextInt();
    //         if(arr[i][j] > max){
    //             max=arr[i][j];
    //         }
    //     }
    // }
    // System.out.println("The largest element in an array:"+ max);


    /*PRINT SECOND LARGEST NUMBER IN AN 2D  ARRAY */

    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         arr[i][j]=sc.nextInt();
    //         if(arr[i][j] > max){
    //             max=arr[i][j];
    //         }
    //         max--;
    //     }
    // }
    // System.out.println("The largest element in an array:"+ max--);



    /* 1Q)CHECK IF A MATRIX IS SYMMETRIC */
    /*HINT: arr[i][j]         arr[j][i] */
    // if(rows!=cols){
    //     System.out.println("Matrix is not Symmetric");
    //     return;
    // }
    System.out.println("Enter elements in matrix:");
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // boolean isSymmetric=true;

        // for(int i=0;i<rows;i++){
        //     for(int j=i+1;j<cols;j++){
        //         if(arr[i][j]!=arr[j][i]){
        //             isSymmetric = false;
        //             break;
        //         }
        //     }
        // }

        // if(isSymmetric){
        //     System.out.println("Symmetric matrix");
        // }
        // else{
        //     System.out.println("Not a Symmetric Matrix");
        // }


    /* 2Q)WRITE A PROGRAM TO TRANSPOSE A 2D MATRIX */
    
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Transpose Matrix");
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

}