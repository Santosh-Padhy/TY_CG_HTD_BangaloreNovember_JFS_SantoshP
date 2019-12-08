package nestedTry;

public class Employee implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
	System.out.println("Clone is running...");
		// TODO Auto-generated method stub
		return super.clone();
	}
}
