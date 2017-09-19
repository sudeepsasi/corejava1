package today28;

public class Employee {
	private int Id;
	private String Name;
	private static double Salary;
	
	//constructor
	public Employee(int Id,String Name ){
		this.Id = Id;
		this.Name = Name;
		
		
	}
	public int  changeId(int Id){
		return Id;
	}
	public static void displaySalary(){
		System.out.println("show Salary:" +Salary);
		
	}
	

	}
	


