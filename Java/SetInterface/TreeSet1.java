import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet t1 = new TreeSet();
	t1.add(12);
	t1.add(34);
	t1.add(40);
	t1.add(40);
	//t1.add("Santosh");
	t1.remove(34);
	t1.add(null);
	
	for( Object o1 : t1) {
		System.out.println(o1);
	}
}
}
