
public class Student1 implements Comparable<Student1>{
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}






	public int compareTo(Student1 o) {
		if(this.id>o.id) {
			return 1;
		}else if(this.id<o.id)
		       {
			return -1;
	               	}
		else {
			return 0;
		}
	}


public static void main(String[] args) {
	
	
}

















}
