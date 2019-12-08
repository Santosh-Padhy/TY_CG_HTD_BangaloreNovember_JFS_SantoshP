
public class Crush {
	void receive(Phone p) {
		if(p instanceof Nokia) {
			System.out.println("Thanks");
		}
		 if(p instanceof Oppo) {
			System.out.println("Thank you ");
		}
		else if(p instanceof OnePlus) {
			System.out.println("Thank you so much");
		}
		else if(p instanceof Apple) {
			System.out.println("Love you");
		}
		else {
			System.out.println("Idiot");
		}
	}

}
