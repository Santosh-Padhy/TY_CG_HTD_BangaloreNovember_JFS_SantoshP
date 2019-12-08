
public class Teacher {
int tid;
String tname;
public Teacher(int tid, String tname) {
	super();
	this.tid = tid;
	this.tname = tname;
}
public boolean equals(Object obj)
{
	Teacher t1 = (Teacher)obj;
	if(t1.tid==this.tid)
	{  
	
	
		if(t1.tname.equals(this.tname)) 
		{
			return true;
		}
		else
			return false;
		
}else
	return false;
}
	
	

}