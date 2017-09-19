package inheritance25;
//class
public abstract class Vehicles {
//fields
	private String Design;
	private double Rate;
	//constructor
	public Vehicles(String Design, double Rate){
		this.Design = Design;
		this.Rate = Rate;
		
	
	}
	//methods
	public abstract void Milage();
	public abstract void speed();
	
 public void dispCondition(){
	 System.out.println("vehicles Design:" +Design);
	 System.out.println("vehicles Rate:" +Rate);
 }
}
