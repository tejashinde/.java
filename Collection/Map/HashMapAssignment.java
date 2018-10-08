import java.util.Scanner;
import java.util.TreeMap;;

public class HashMapAssignment
{
    public static void main(String args[])
    {
        int number;
        TreeMap <Integer,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Number : ");
            number = scanner.nextInt();
            if(number == -1)
                break;
            if(treeMap.containsKey(number))
            {
                int value = treeMap.get(number);
                value += 1;
                treeMap.put(number,value);
            }
            else
                treeMap.put(number, 1);
        }

        System.out.println(treeMap);
    }
}
