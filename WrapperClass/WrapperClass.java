public class WrapperClass
{
    public static void show(Object object)
    {
        System.out.println(object);
    }
    public static void main(String args[])
    {
        String s = "Tejas";
        show(s);

        //Auto Boxing
        int number = 10;
        show(number);

        //Boxing
        Integer I = new Integer(number);

        //Unboxing
        Integer Y = new intValue();

        //Boxing
        Integer numberBoxed = number;
    }
}
