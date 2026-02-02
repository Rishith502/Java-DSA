import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,2,3,4,5,5,6));

        ArrayList<Integer> unique = new ArrayList<>();

        for(int a : list){
            if(!unique.contains(a)){
                unique.add(a);
            }
        }
        System.out.println(unique);
    }
}
