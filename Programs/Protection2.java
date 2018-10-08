package p2;
import p1.*;
class Protection2 extends p1.Protection
 {
Protection2{}
System.out.println("Derived other package constructor");

System.out.println("n_pro = " + n_pro);
System.out.println("n_pub = " + n_pub);
}
}