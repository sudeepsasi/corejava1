package testing;
//class
public class Hotel {
	//fields
	int serialNo;
	String Name;
	double Rate;
	//constructor
	public Hotel(){
		this.serialNo = 0;
		this.Name = "";
		this.Rate = 0.0;
		
	}
	public Hotel(int serialNo, String Name, double Rate){
		this.serialNo = serialNo;
		this.Name = Name;
		this.Rate = Rate;
		
	}
	//methods
	public void changeRate(double Rate){
		this.Rate = Rate;
	}
	public void disphoteldetails(){
		System.out.println("serialno:"+serialNo);
		System.out.println("hotel Name:"+Name);
		System.out.println("Bill rate:"+Rate);
	}
}
