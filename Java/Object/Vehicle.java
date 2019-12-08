

public class Vehicle implements Cloneable{
  String vname;
  Vehicle( String vname)
  {
	  this.vname=vname;
  }
@Override
protected Object clone() throws CloneNotSupportedException {

	return super.clone();
}
  
}
