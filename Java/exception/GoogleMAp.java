package finallyBlock;

public class GoogleMAp {
void findLocation(String loc) {
	try {
		System.out.println(loc.length());
	}catch(NullPointerException n)
	{
		System.out.println("please fill the loaction  you want to search");
	}
}
	
	
}
