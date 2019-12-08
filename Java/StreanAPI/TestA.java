import java.util.function.*;
public class TestA {

	public static void main(String[] args) {
		System.out.println("---------------Predicate------------");
		Predicate<Integer> p = i  -> i%2==0;
		boolean b1 = p.test(34);
		System.out.println(b1);
		System.out.println(p.test(40));
		
		System.out.println("-------------Function-------------");
		Function<Integer,Integer> f1 = i-> i*100;
		int a = f1.apply(45);
		System.out.println(a);
		System.out.println("--------------------------Supplier-----------------------");
		Supplier <Person>s1 = ()  -> new Person(34,"RAMU");
		System.out.println(s1.get().getAge());
		System.out.println(s1.get().getName());
		
		
		System.out.println("---------------------------------------Consumer-------------------------------");
		Consumer<Person> c1 = j-> {
			System.out.println(j.getAge());
		System.out.println(j.getName());
		};		
			Person p1 = new Person(12,"Hari");
			c1.accept(p1);
			
	
		
		
		
		
		
		
		
		
		
		}
	

}
