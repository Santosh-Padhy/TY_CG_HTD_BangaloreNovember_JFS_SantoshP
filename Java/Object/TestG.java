
public class TestG {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	Gclass g1 = new Gclass("Santosh");
	Class c1 = g1.getClass();
	System.out.println(c1);
	Gclass g2 = (Gclass)c1.newInstance();
	System.out.println(g2.name);
	Class c2 = Class.forName("Gclass");
	System.out.println(c2);
Gclass g3 = (Gclass)c2.newInstance();
System.out.println(g3.name);
Gclass g5 = (Gclass)g1.newInstance();
}
}
