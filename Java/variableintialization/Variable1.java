
public class Variable1 {
	final  int Maximum;
	static final int Minimum;
	public Variable1(){
		System.out.println("constructor is called");
	
	}
	
	public Variable1(int q){
		System.out.println("constructor is overloaded");
	}
	{
	   System.out.println("instance intializer block executed");
		this.Maximum=5899;
	}
	static {
		Minimum =6577;
		System.out.println("static block executed");
	}

}
