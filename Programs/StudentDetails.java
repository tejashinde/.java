class Person{
  String name;

  public Person(String name){
    this.name = name;
  }

  void DisplayDetails(){
    System.out.println(name);
  }
}

class Student extends Person{
    int prn;
    int marks;

    public Student(String name,int prn, int marks){
      super(name);
      this.prn = prn;
      this.marks = marks;
    }

    void DisplayDetails ()
    {
      System.out.println("The student name is " + name + " and his/her PRN is " + prn + " and he/she scored " + marks + " marks ");
    }
}

class Teacher extends Person{
  String subject;
    public Teacher(String name,String subject){
      super(name);
      this.subject = subject;
  }

  void DisplayDetails(){
    System.out.println("The teacher is " + name + " and she teaches " + subject);
  }
}

public class StudentDetails{
  public static void main(String args[]){
    Person s = new Student("Tejas",55,100);
    Person t = new Teacher("Anoushka","History");
    s.DisplayDetails();
    t.DisplayDetails();
}
}
