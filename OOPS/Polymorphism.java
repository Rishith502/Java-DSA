package OOPS;

//Compile Time Polymorphism (Method Overloading)
// same methods, different parameters
// class MathOperators {
//     int add(int a, int b){
//         return a+b;
//     }

//     int add(int a, int b, int c){
//         return a+b+c;
//     }

//     double add(double a, double b){
//         return a+b;
//     }
//}

public class Polymorphism {
    public static void main(String[] args) {
        // MathOperators obj = new MathOperators();
        // System.out.println(obj.add(5,10));
        // System.out.println(obj.add(5,10,15));
        // System.out.println(obj.add(5.5, 10.2));


        System.out.println(Students.schoolName);
    }
}

//Runtime Polymorphism (Method Overriding)
// same method in parent class is extended by child classes

//STATIC AND FINAL KEYWORDS

/*Static keyword in java is used for memory management and allows 
shared access to class memebers without creating an instance of the class.
Java is not 100% Object-Oriented Programming.

Final Keyword is used to restrict modifications in Java.
It can be applied to variables,methods,and classes.
*/

//STATIC

class Students{
    public static String schoolName = "ATS";
}