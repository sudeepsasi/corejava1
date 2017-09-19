package inheritance18;

public class Shopkeeper {
	private int ShopNo;
	private String ShopName;
	private double Rate;
	
	Shopkeeper(){
		ShopNo = 0;
		ShopName ="";
		Rate = 0.0;
	}
	Shopkeeper(int ShopNo,String ShopName, double Rate){
		this.ShopNo = ShopNo;
		this.ShopName = ShopName;
		this.Rate = Rate;
	}
	public void dispdetails(){
		System.out.println("Shoop No:" +ShopNo);
		System.out.println("Shop Name:" +ShopName);

	
	
	}
	public double getRate(){
		return Rate;


}
}