public class StringBuffer
{
  public static void main(String args[])
  {
    StringBuffer sb = new StringBuffer(3);
    System.out.println(sb.capacity());
    sb.append("Hello");
    System.out.println(sb + " " + sb.capacity() + " " + sb.length());
    System.out.println(sb.codePointAt(0));
    sb.insert(5,"Hi");
    System.out.println(sb);
    sb.replace(5,7,"Hello");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    String s = sb.toString();
    System.out.println(s);
  }
}


//First character of username must be uppercase and should not contain spaces
//Password minimum 8 characters long
//1 Special characters
//1 Capital letter
//1 small letter
//1 digit
