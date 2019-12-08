
public class Worker implements Comparable<Worker>{
	
	double salary;
	String name;
	public Worker(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
@Override
	public int compareTo(Worker o) {
		if(this.salary>o.salary) {
			return 1;
		}else if(this.salary<o.salary){
			return -1;
			
		}else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

	

}
