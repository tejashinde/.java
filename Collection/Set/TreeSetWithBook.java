import java.util.TreeSet;
import java.util.Comparator;
/*
You don't have to explicitly override equals and hashCode method like in HashSet
*/
class Book implements Comparable <Book>
{
    private int id;
    private String name;

    public Book(){}

    public Book(int id , String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "ID : " + id + " " + "Name : " + name;
    }

    @Override
    public int compareTo(Book book)
    {
        return this.id - book.id;
    }

}

class BookIdSort implements Comparator <Book>
{
    public BookIdSort(){}

    @Override
    public int compare(Book mBook , Book nBook)
    {
        return mBook.getId() - nBook.getId();
    }
}

public class TreeSetWithBook
{
    public static void main(String args[])
    {
        TreeSet <Book> bookTreeSet = new TreeSet<>(new BookIdSort());
        //Making Objects

        Book book1 = new Book(101 , "Nancy Drew");
        Book book2 = new Book(109 , "Harry Potter");
        Book book3 = new Book(103 , "Java Basics");
        Book book4 = new Book(127 , "Python Dr.DRE");
        Book book5 = new Book(305 , "Data Structures Book");
        Book book6 = new Book(329 , "Tomb Raider");
        Book book7 = new Book(8 , "Leaves fall");
        Book book8 = new Book(112 , "Leaves fall");

        //Adding objects too Tree Set
        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);
        bookTreeSet.add(book5);
        bookTreeSet.add(book6);
        bookTreeSet.add(book7);
        bookTreeSet.add(book8);

        for(Book book : bookTreeSet)
        {
            System.out.println(book);
        }
    }
}
