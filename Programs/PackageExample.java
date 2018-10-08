import p1.MyPackage;
class PackageExample
{
    public static void main(String[] args)
    {
        MyPackage m = new MyPackage();
        System.out.println("Hello World " + m.squareOfNumber(3));
    }
}
//After Compiling the package file,
//javac -d . PackageExample.java
//java PackageExample.java