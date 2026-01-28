import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // StringBuilder str = new StringBuilder("Hello ");
        // str.append("world");
        // System.out.println(str);

        String str = "Hello World";

        StringBuilder st= new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            st.append(str.charAt(i));
        }
        System.out.println(st);

    }
}
