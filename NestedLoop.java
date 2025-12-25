public class NestedLoop {
    public static void main(String[] args) {
        //Outer
        // for(int i=0;i<=2;i++){
        //     System.out.print(i); //Executes 2 times
        //     //Inner
        //     for(int j=0;j<=3;j++){
        //         System.out.print(j); //Executes 6 times (2 * 3)
        //     }
        //     System.out.println("");
        //}
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
