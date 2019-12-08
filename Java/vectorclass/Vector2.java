import java.util.*;
public class Vector2 {
public static void main(String[] args) {
	Vector v1=  new Vector();
	v1.add(23);
	v1.add(78);
	v1.add(89);
	v1.add(2);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	//v1.trimToSize();
	//System.out.println(v1.size());
	v1.setSize(2);
	System.out.println(v1.size());
	System.out.println(v1);
	v1.add(1, 34);
	System.out.println(v1);
	Object i1[]= new Object[v1.size()];
	v1.copyInto(i1);
	for(int i= 0;i<i1.length;i++) {
		System.out.println(i1[i]);
	}
	v1.addElement(12);
	System.out.println(v1);
v1.removeElement(23);
System.out.println(v1);
v1.removeAllElements();
System.out.println(v1);
System.out.println("===========================================================");

Vector v3 = new Vector();
v3.add(34);
v3.addElement(45);
Vector v2 = new Vector();
v2.addElement(78);
v2.addElement(67);
//v2.addElement(9);
System.out.println(v2.size());
System.out.println(v2.capacity());
v2.trimToSize();
System.out.println(v2.size());
System.out.println(v2.capacity());
v2.ensureCapacity(5);
System.out.println(v2.size());
System.out.println(v2.capacity());
v2.setSize(7);
System.out.println(v2.size());
System.out.println(v2.capacity());








	
	
}
}
