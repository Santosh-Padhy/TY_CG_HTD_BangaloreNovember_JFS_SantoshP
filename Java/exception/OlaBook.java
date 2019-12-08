package finallyBlock;

public class OlaBook {
	GoogleMAp g1;
	OlaBook(GoogleMAp g1){
		this.g1=g1;
	}
void find(String a)
{
	try {
		g1.findLocation(a);
		

	}catch(NullPointerException e1)
	{
		
		System.out.println("Ola user pls enter proper location");
	}
	}
}
	
	



