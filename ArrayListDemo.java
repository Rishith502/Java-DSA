
        /*
        ArrayList is a resizable array  implementation 
        of the List interface in Java.Unlike arrays,
        it can grow and shrink dynamically as elements
        are added or removed.

        Use:
            Dynamic resizing-no need to define size beforehand.
            Provides many built-in methods for manipulation.
            Allows random access like arrays.
            Maintains insertion order.
        ArrayList can store objects of any type.(not primitive)
        Integer.String,Boolean,Float
        1) ArraayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            number.add(20);
            System.out.println(numbers.get(1));
        2) ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");

        Here we are not storing primitive int values
        we are actually storing integer objects(the wrapper class of int).
        int is a primitive type,while Integer is an object type,
        and that's exactly why Integer was created --So that numbers
        can be stored inside object-based structurs like ArrayList.

        Methods in ArrayList:
            add(),addAll(),clear(),clone(),contains(),ensureCapacity(),
            forEach(),get(),indexOf(),isEmpty(),iterator(),lastIndexOf(),
            listIterator(),remove(),removeAll(),removeIf(),replaceAll(),
            retainAll(),set(),size(),sort(),spliterator(),subList(),toArray(),
            trimToSize()


        
            ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
        for loop:
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }


            ArrayList<String> names = new ArrayList<>();
            names.add("Rishith");names.add("Rishi");
        for-each loop:
            (String name : names) {
                System.out.println(name);
            }


        Iterator:
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()){
                String fruit = iterator.next();
                System.out.println(fruit);
            }

        Collection:
            The Collection class in java exists to provide common
            utility methods like sort(),reverse(),and shuffle() that 
            work on aby type of list.

            This functions are kept in one place to avoid rewrite
            of same logic in every collection class.

            They work because all lists share a common interface
            which provides methods like get(),set(),and size()
            so the algorithm can work generically on all of them,
            regardless of their internal structure.
        
        */

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        //System.out.println(list);   [10,20,30]
        //System.out.println(list.get(0));   [10]

        list.set(1,25);
        if(list.contains(20)){
            System.out.println("The number is  in the list");
        }
        // System.out.println(list);    //[10,25,30]

        // Collections.reverse(list);   

        // System.out.println(list);    //[30,25,10]

        //MAX ELEMENT
        // int max = Collections.max(list);
        // System.out.println(max);            //[30]

        //MIN ELEMENT
        int min = Collections.min(list);
        System.out.println(min);
    }
}
