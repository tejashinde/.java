//Base or supreclass
class A
{
	int i,j;
	void showij()
	{
		System.out.println("i=" + i + "j=" +j);
	}
}
//Derived or child class
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("k=" + k);
	}
	void sumijk()
	{
		System.out.println("Sum is : " + (i + j + k));		
	}
}		

class inheritence
{
	public static void main(String []args)
	{
		A supobj = new A();
		B subobj = new B();
		supobj.i=10;
		supobj.j=20;
		supobj.showij();
		
		subobj.k=30;
		subobj.showk();
		
		subobj.i=7;
		subobj.j=9;
		subobj.sumijk();
	}
}