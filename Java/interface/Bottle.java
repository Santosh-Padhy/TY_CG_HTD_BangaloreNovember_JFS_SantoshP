package interfaceConcept;

public interface Bottle {
	
	void open();
	void drink();
	default void juice()
	{
		System.out.println("ji");
	}
static void close()
{
	System.out.println("Close all the section ");
}
}
