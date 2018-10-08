import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/*
get()
put()
containsKey()
containsValue()
remove()
size()
isEmpty()

Map doesn't support Iterator
*/
public class HashMapDemo
{
    public static void main(String args[])
    {
        HashMap <Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"Tejas");
        hashMap.put(295,"Vedant");
        hashMap.put(168,"Ankesh");
        hashMap.put(351,"Azhar");
        hashMap.put(985,"Sarthak");
        hashMap.put(111,"Marculus");

        TreeMap <Integer,String> treeMap = new TreeMap<>();
        treeMap.put(101,"Tejas");
        treeMap.put(295,"Vedant");
        treeMap.put(168,"Ankesh");
        treeMap.put(351,"Azhar");
        treeMap.put(985,"Sarthak");
        treeMap.put(111,"Marculus");
/*        System.out.println(hashMap);
        //Replacing 101 name with feeroz
        hashMap.put(101,"Feeroz");
        System.out.println(hashMap);
        //Getting value of key 111
        System.out.println(hashMap.get(111));

        System.out.println("85 present : " + hashMap.containsKey(85) + " Ankesh present : " + hashMap.containsValue("Ankesh"));
        System.out.println("Size : " + hashMap.size());
        System.out.println("Removing '85 = Sarthak'");
        hashMap.remove(85);*/

        Set <Integer> keySet = hashMap.keySet();
        Iterator <Integer> iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            Integer key = iterator.next();
            // String value = hashMap.get(key);
            System.out.println("Key -> " + key + " | Value -> " + hashMap.get(key));
        }
    }
}

class Employee
{
    public Employee(){}
}
