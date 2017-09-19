package inheritance18;

public class customer extends Shopkeeper {
	private double Offer;
	
	//check your notes, some lines missing
	public customer() {
	super();
	Offer= 0.0;
}
	
public customer(int ShopNo,String ShopName, double Rate, double Offer){
	super(ShopNo,ShopName,Rate);
	this.Offer = Offer;
}
public void dispRate(){
	double totalRate = super.getRate()+Offer;
	System.out.println("total Rate:" + totalRate);

}
}