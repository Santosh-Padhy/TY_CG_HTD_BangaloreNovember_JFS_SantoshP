import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet<Worker> t1 = new TreeSet<Worker>();
		t1.add(new Worker(27500.00,"Suresh"));
		t1.add(new Worker(28900.00,"Rama"));
		for (Worker w1 : t1) {
			System.out.println("salary is"+w1.salary+"name is"+w1.name);
			
		}
	}

}
