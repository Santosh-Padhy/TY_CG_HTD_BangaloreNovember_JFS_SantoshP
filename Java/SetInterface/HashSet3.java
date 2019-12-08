import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet <Student>h1 = new HashSet<Student>();
		h1.add(new Student(2,"Shree"));
		h1.add(new Student (2,"Shree"));
		for (Student s2 : h1) {
			System.out.println("Student id is"+s2.id+"name is"+s2.name);
		}
	}

}
