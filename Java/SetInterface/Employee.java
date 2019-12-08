
public class Employee {
int eid;
String ename;
public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + eid;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (eid != other.eid)
		return false;
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + "]";
}
	public static void main(String[] args) {
		
	}

}
