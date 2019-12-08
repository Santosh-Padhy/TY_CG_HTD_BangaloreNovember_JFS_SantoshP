package throwandthrows;

public class IRCTC {
	public void confirmTicket()throws ClassNotFoundException {
		try {
			Class.forName("throwthrows.Paytm");
			System.out.println("ticketr is confirmed");
		}catch(ClassNotFoundException e) {
			System.out.println("ticket is not confirmed");
			throw e;
		}
	}

}
