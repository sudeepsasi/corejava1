
public class course {
	
	//fields
	private int cid;
	private String cName;
	private double cFees;
	
	
	//constructor
	
	public course(){
		cid = 0;
		cName = "";
		cFees = 0;
		
	}

	public course(int id, String Name){
		this.cid = id;
		this.cName = Name;
	}
	public course(int id,String Name, double Fees ){
		cid = id;
		cName = Name;
		cFees = Fees;
	}
	//methods
	public void dispCorseDetails(){
		System.out.println("Course id:" +cid);
		System.out.println("Course Name:" +cName);
		System.out.println("Course Fees" +cFees);
	}
	
	
	//were is abstraction applied for course?
	
		
}








