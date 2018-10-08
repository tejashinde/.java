import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListDemo
{
    public LinkedListDemo(){}

    public static void main(String args[])
    {
        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.add("Tejas");
        linkedList.add("Alair");
        linkedList.add("Azhar");
        linkedList.add("Vedant");
        linkedList.add("Ankesh");
        linkedList.add("Aditya");
        linkedList.add("Sarthak");
        linkedList.add("Johncy");
        linkedList.add("Marculus");
        linkedList.addLast("Git");
        linkedList.addLast("Hub");
        System.out.println("Linked List : " + linkedList);
        System.out.println("Size : " + linkedList.size());

        /*ListIterator <String> listIterator = linkedList.listIterator(linkedList.size());
        while(listIterator.hasPrevious())
        {
            String element = listIterator.previous();
            System.out.println(element);
        }*/

        /*Iterator <String> iterator = new linkedList.iterator();
        while(iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println(element);
        }
        for(String element : linkedList)
        {
            System.out.println(element);
        }*/

        /*Vector <String> vectorList = new Vector<>();
        vectorList.add("Tejas");
        vectorList.add("Alair");
        vectorList.remove(0);*/


    }
}
