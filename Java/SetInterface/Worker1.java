import java.util.Comparator;

public class Worker1 implements Comparator<Worker1> {
int age;
String name;
double salary;
public Worker1(int age, String name, double salary) {
	super();
	this.age = age;
	this.name = name;
	this.salary = salary;
}





	@Override
	public int compare(Worker1 o1, Worker1 o2) {
		if(o1.age>o2.age) {
			return 1;
			
		}else if(o1.age<o2.age) {
			return -1;
		}else {
			return 0;}
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

	

}
