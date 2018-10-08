public class GenericClass
{
    public static void main(String args[])
    {
        // Data <Integer> data = new Data <> ();
        Data <String> name = new Data <> ();
        // data.setVar(10);
        name.setVar("Tejas");
        System.out.println(name.getVar());
    }
}

class Data <Generic>
{
    private Generic genericVar;
    public Data(){}
    public Generic getVar()
    {
        return genericVar;
    }
    public void setVar(Generic genericVar)
    {
        this.genericVar = genericVar;
    }
}
