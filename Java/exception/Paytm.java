package throwandthrows;

public class Paytm {
	IRCTC i1;
	Paytm(IRCTC i1)
	{
		this.i1=i1;
	}
public void bookTicket()
{
	try {
		i1.confirmTicket();
	}catch(ClassNotFoundException e)
	{
		System.out.println("ticket is no confirmed");
	}
}
}
