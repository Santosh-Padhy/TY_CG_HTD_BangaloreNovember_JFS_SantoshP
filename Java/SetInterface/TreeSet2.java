import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Student1> t1 = new TreeSet<Student1>();
		t1.add(new Student1 (2,"Manas"));
		t1.add(new Student1(3,"Sonu"));
		for (Student1 st1: t1) {
			System.out.println(st1.name);
			
		}
	}

}
