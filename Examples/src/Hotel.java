//class
public class Hotel {
	//fields
	private String Items;
	private double Rate;
	private int Range;
	
	//constructors
	
	public Hotel(String Items, double Rate){
		this.Items = Items;
		this.Rate = Rate;
		this.Range = 0;
		
	}
	public Hotel(String Items,double Rate,int Range){
		this.Items = Items;
		this.Rate = Rate;
		this.Range = Range;
		
	}
	    
	//methods
	public void ChangeRate(double Rate){
		this.Rate = Rate;
	}
	public int showRange(){
		return Range;
		
	}
	public void dispHotelDetails(String Items, double Rate, int Range){
		System.out.println("Item Name: +Item");
		System.out.println("Show Rate:" +Rate);
		System.out.println("Find Range " +Range);
	}

}
