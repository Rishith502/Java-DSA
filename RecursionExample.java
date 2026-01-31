public class RecursionExample {
        //Base case
        // if (/* condition to stop recursion */) {
        //     return;
        // }

        // // Recursive Case
        // recursiveMethod();

        //SUM OF FIRST N NATURAL NUMBERS
        // static int sum(int n){
        //     if(n == 1)return 1;
        //     return n+sum(n-1); //10 + sum(9)
        // }
        // public static void main(String[] args) {
        //     Scanner sc=new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int result = sum(n);
        //     System.out.println(result);
        //}


            // FACTORIAL OF N NUMBERS
    //         public static int factorial(int n){
    //             if(n==1){
    //                 return 1;
    //             }
    //             return n * factorial(n-1);
    //         }
    //         public static void main(String[] args) {
    //             System.out.println(factorial(5));
    // }



        //FIBONACCI SERIES
        // public static int fibonacci(int n){
        //     if(n==0)return 0;
        //     if(n==1 || n==2)return 1;
        //     return fibonacci(n-1) + fibonacci(n-2);
        // }
        // public static void main(String[] args) {
        //     System.out.println(fibonacci(8));
        // }


        //REVERSE A STRING

        public static String reverse(String str){
            if(str.isEmpty()){
                return str;
            }
            return reverse(str.substring(1)) + str.charAt(0);
        }
        public static void main(String[] args) {
            System.out.println(reverse("RISHITH"));
        }


}
