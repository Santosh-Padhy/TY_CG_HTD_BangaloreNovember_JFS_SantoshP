package methodoverriding;

public class TestCalculator extends Calculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int r1 = c1.add(34);
		System.out.println(r1);
		int r2 = c1.add(56,89);
		System.out.println(r2);
		double r3 = c1.add(65.90);
		System.out.println(r3);
		Calculator.multiply(45);
		Calculator.multiply(67, 78);
		Calculator.multiply(78.98);
		
	}

}
