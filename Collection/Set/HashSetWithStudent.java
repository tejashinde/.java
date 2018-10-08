import java.util.HashSet;
/*
For getting unique objects you need to override the equals method and hashCode method
*/
public class HashSetWithStudent
{
    public static void main(String args[])
    {
        HashSet <Student> studentHashSet = new HashSet<>();
        Student student1 = new Student(04 , "Tejas" , 98);
        Student student2 = new Student(19 , "Marc" , 90);
        Student student3 = new Student(07 , "Ankesh" , 78);
        Student student4 = new Student(37 , "Tejas" , 98);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for(Student student : studentHashSet)
        {
            System.out.println(student);
        }
    }
}

class Student
{
    private int prn;
    private String name;
    private int marks;

    public Student(){}

    public Student(int prn , String name , int marks)
    {
        this.prn = prn;
        this.name = name;
        this.marks = marks;
    }

    public int getPrn()
    {
        return prn;
    }

    public void setPrn(int prn)
    {
        this.prn = prn;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public boolean equals(Object object)
    {
        Student student = (Student) object;
        if((this.prn == student.prn) && (this.name.equals(student.name)) && (this.marks == student.marks))
            return true;
        else
          return false;
    }

    public int hashCode()
    {
        int number = 31 * prn + name.length() + marks;
        System.out.println("Hash code for prn " + prn + " is : " + number);
        return number;
    }

    public String toString()
    {
        return prn + " " + name + " " + marks;
    }
}
