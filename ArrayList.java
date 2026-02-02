
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
        
        */

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }
}
