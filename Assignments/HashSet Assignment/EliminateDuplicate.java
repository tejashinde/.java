import java.util.LinkedHashSet;
public class EliminateDuplicate
{
    public static void main(String args[])
    {
        String string = "Tejas Tejas is is a a Boy Boy";
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();
        for (String element : string.split(" "))
            linkedHashSet.add(element);
        System.out.println(linkedHashSet);
    }
}
