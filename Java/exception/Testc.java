
public class Testc {
	
public static void main(String[] args) {
	System.out.println("main Started");
	int a[] = new int[3];
	a[0]=10;
	a[1]=10;
	a[2]=10;
	try {
	a[3]=10;}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("a");
	}
	System.out.println("main ended");
	
}
}
