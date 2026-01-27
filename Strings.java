import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(str.charAt(0));
        //System.out.println(str.toUpperCase());
        //System.out.println(str.toLowerCase());


        //1Q)WRITE A PROGRAM TO REVERSE A GIVEN STRING.
        
        // String reversedString = "";

        // for(int i=str.length()-1;i>=0;i--){
        //     reversedString = reversedString + str.charAt(i);
        // }
        // System.out.println(reversedString);

        //2Q)CHECH IF A STRING IS A PALINDROME
        String str1=str.toLowerCase();
        boolean isPalindrome = true;
        for(int i=0;i<str.length()/2;i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
    
        
        if(isPalindrome)System.out.println("It is a palindrome");
        else System.out.println("It is not a Palindrome");

        /*3Q)WRITE A PROGRM TO COUNT THE NUMBER OF
            VOWELS AND CONSONENTS IN A STRING */


        
    }
    
}
