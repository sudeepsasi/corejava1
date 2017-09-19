package inheritance25;
//class
public class Student extends College {
	
	
	//fields
	private String Department;
	//constructors
	public Student(){
	super();
	this.Department = "";
	}
	public Student(int Id,String Name, double Fees,String Department){
		super( Id, Name, Fees);
		this.Department = Department;
	
	}
	public void dispStudentDepartment(){
		System.out.println("show Student Deparment:" +Department);
	}
}
	
	
	


