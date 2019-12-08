import java.util.*;
public class Vector1 {
public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.add(23);
	v1.add(67);
	v1.add(90);
	v1.add(12);
	System.out.println(v1);
	v1.remove(new Integer(90));
	System.out.println(v1);
	v1.addElement(null);
	System.out.println(v1);
	Iterator itr = v1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
		System.out.println("==================================================================");
	for(int i= 0;i<v1.size();i++)
		System.out.println(v1.get(i));
	}
}

