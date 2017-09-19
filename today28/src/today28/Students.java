package today28;

public class Students extends College implements Fees {
 

	public String Department;

	public Students(int Id, String Name, String Department) {
		super(Id, Name);
		this.Department = Department;
	}
 
	
	public void Studentdep(){
		System.out.println("student department:"+Department);
	}



}
