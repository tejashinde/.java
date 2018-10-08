import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/*
add()
remove()
index()
set()
get()
isEmpty()
clear()
iterator()
hasNext()
Collections.sort() will take objects which extend Comparable or Comparator and collection of object of comparable interface
*/
class Student implements Comparable <Student>
{
    String name;
    int id;

    public Student(){}

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String toString()
    {
        return name + " " + id + " ";
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    @Override
    public int compareTo(Student student)
    {
        return this.id - student.id;
    }
}

// class StudentNameSort implements Comparator <Student>
// {
//     @Override
//     public int compare(Student mStudent , Student nStudent)
//     {
//         return mStudent.getName().compareTo(nStudent.getName());
//     }
// }

class DescendingSort implements Comparator <String>
{
    public DescendingSort(){}

    @Override
    public int compare(String mString, String nString)
    {
        return nString.compareTo(mString);
    }
}

public class ArrayListDemo
{
    public ArrayListDemo(){}
    public static void main(String args[])
    {
        // ArrayList <String> arrayList = new ArrayList<>();
        // ArrayList <Student> studentList = new ArrayList<>();
        // Student s1 = new Student("Tejas",37);
        // Student s2 = new Student("Ankesh",07);
        // Student s3 = new Student("Vedant",04);
        // studentList.add(s1);
        // studentList.add(s2);
        // studentList.add(s3);
        //
        // Iterator <Student> iterator = studentList.iterator();
        // while(iterator.hasNext())
        // {
        //     Student studentObj = iterator.next();
        //     System.out.println(studentObj);
        // }
        // Collections.sort(studentList);
        //
        // StudentNameSort studentNameSort = new StudentNameSort();
        // List.sort(studentList,studentNameSort);

        // Collections.sort()

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Male");
        arrayList.add("Tejas");
        arrayList.add("Ankesh");
        Collections.sort(arrayList,new DescendingSort());
        System.out.println("Descending Order : " + arrayList);
        // Object mArray[] = arrayList.toArray(); // will convert ArrayList to array
        // Iterator iterator = arrayList.iterator();
        // while(iterator.hasNext())
        // {
        //     String string = (String) iterator.next();
        //     System.out.println(string);
        // }

        //
        // for(String element : arrayList)
        // {
        //     System.out.println(element);
        // }
        //
        // // arrayList.add(037);
        // // arrayList.add(95000);
        // // arrayList.add(0,200);
        // System.out.println("Size of Array List " + arrayList + " is : " + arrayList.size());
        // System.out.println(arrayList.contains("Tejas"));
        // System.out.println("Element present at index 1 : " + arrayList.get(1));
        // arrayList.set(arrayList.indexOf("Male"),"Vedant");
        // arrayList.remove("Tejas");
        // Collections.sort(arrayList);
        // System.out.println(arrayList);
    }
}
