import java.util.Comparator;

public class Worker2 implements Comparator<Worker2> {

	int age;
	String name;
	double salary;
	public Worker2(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}





		@Override
		public int compare(Worker2 o1, Worker2 o2) {
			return o1.name.compareTo(o2.name);
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
