//class
public class course {
	//fields
private	int Id;
private	String Name;
private	double Fees;
private double Offer;
private double Studentcourse;		//what is StudentCourse?? 
	
	//constructors
 public	course(){
		this.Id = Id;
		this.Name = Name;
		this.Fees = Fees;
		this.Offer = Offer;
	}
	 public course (int Id, String Name, double Fees, double Offer ){
		this.Id = Id;
		this.Name = Name;
		this.Fees = Fees;
		this.Offer = Offer;
		
	}
//methods
	  public void StudentCourse(int Id, double Fees){
		this.Id = Id;
		this.Fees = Fees;
	}
	  
	public double StudentCourse(double Fees,double Offer){
		Studentcourse = Fees*Offer;
		
		return Studentcourse;
	}
	
}
