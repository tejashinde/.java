/*
Hash Set stored unique values in a random or unordered manner
Uses hashing to store objects
add()
remove()
isEmpty()
addAll()*/

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo
{
    public static void main(String args[])
    {
        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("Tejas");
        hashSet.add("Ankesh");
        hashSet.add("Alair");
        hashSet.add("Alair");
        hashSet.add("Aditya");
        hashSet.add("Azhar");
        hashSet.add("Azhar");
        hashSet.add("Marculus");
        hashSet.add("Vedant");

        System.out.println(hashSet);
        System.out.println("Size : " + hashSet);
        hashSet.remove("Alair");
        System.out.println(hashSet);

        Iterator <String> iterator = hashSet.iterator();
        System.out.println("-----------------------------USING ITERATOR----------------------------------------");
        while(iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println(Element);
        }
        System.out.println("-----------------------------USING FOR EACH----------------------------------------");
        for(String element : hashSet)
        {
            System.out.println(element);
        }

        /*HashSet <String> TreeSet = new TreeSet<>();
        hashSet.add("Tejas");
        hashSet.add("Ankesh");
        hashSet.add("Alair");
        hashSet.add("Alair");
        hashSet.add("Aditya");
        hashSet.add("Azhar");
        hashSet.add("Azhar");
        hashSet.add("Marculus");
        hashSet.add("Vedant");*/
    }
}
