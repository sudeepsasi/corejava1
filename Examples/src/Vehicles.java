//class
public class Vehicles {
	//fields
	private int Number;
	private String Design;
	private double Rate;
	
	//constructors
	public Vehicles(){
		this.Number = 0;
		this.Design = "";
		this. Rate = 0;
	}
	public Vehicles(int Number, String Design, double Rate){
		this.Number = Number;
		this.Design = Design;
		this.Rate = Rate;
	}
	//methods
	public void dispCondition(){
		System.out.println("Show me Number:" +Number);
		System.out.println("Show me Design:" +Design);
		System.out.println("Show me Rate:" +Rate);
	}
	public void ChangeDesign(String Design){
		this.Design = "Design";
	}
	public Double showmeRate(){
		return Rate;
	}

	

}
