class StringBufferDemo
{
	public static void main(String[] args)
	{
	StringBuffer s1= new StringBuffer();
	System.out.println("Length of s1=" + s1.length());
	System.out.println("Capacity of s1=" +s1.capacity());
	
	StringBuffer s2= new StringBuffer("Java");
	System.out.println("Length of s2=" + s2.length());
	System.out.println("Capacity of s2=" +s2.capacity());
	
	s2.append("Program");
	System.out.println("After Appending s2=" + s2);
	
	s2.insert(0,"Simple");
	System.out.println("After inserting s2=" +s2);
	
	s2.delete(6,10);
	System.out.println("After deleting s2=" + s2);
	
	s2.reverse();
	System.out.println("After reversing s2=" +s2);
	
	s2.hashCode();
	System.out.println("Hash code of 'Java' : " + s2);
	}
}