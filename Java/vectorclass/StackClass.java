import java.util.*;
public class StackClass {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.add(34);
		s1.add(56);
		s1.add(67);
		s1.add(34.567);
		System.out.println(s1);
		//s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(34));
	}

}
