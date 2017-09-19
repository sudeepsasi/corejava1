package inheritance25;
//class

public class College {

//fields
	
	private int Id;
	private String Name;
	private double Fees;
	 
	//constructors
	    public College (){
		this.Id = Id;
		this.Name = Name;
		this.Fees = Fees;
	}
	
	    public College(int Id, double Fees){
		this.Id = Id;
		this.Fees = Fees;
	}
	    public College (int Id,String Name, double Fees){
		this.Id = Id;
		this.Name = Name;
		this.Fees = Fees;
	
	}


	//methods
	public double CollegeFees(){
		return Fees;
	}
	
	public void collegedetails(){
		System.out.println("College ID:" +Id);
		System.out.println("College Name:"+Name);
		System.out.println("College Fees:"+Fees);
	
	
		
		
	}
	
	

}
