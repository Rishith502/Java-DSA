import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     System.out.print("*");
        //     System.out.println("");// prints * line by line upto 5 lines
        // }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        /*Output
            *****
            *****
            *****
            *****
            *****
        */


        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        /*Output
            *
            **
            ***
            ****
            *****
        */

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int m=0;m<i+1;m++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        /*Output
             *
            **
           ***
          ****
         *****
        ******
        */

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int m=0;m<i+1;m++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        /* Output
               * 
              * *
             * * *
            * * * *
           * * * * *
          * * * * * *
        */

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int m=0;m<(i*2)+1;m++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int m=0;m<2*(n-i-1)-1;m++){
                System.out.print("*");
            }
            System.out.println("");
        }

        /*Output 
                    *
                   ***
                  *****
                 *******
                *********
               ***********
              *************
             ***************
              *************
               ***********
                *********
                 *******
                  *****
                   ***
                    *
        
        
        */
    }
}
