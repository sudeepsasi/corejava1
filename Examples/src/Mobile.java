//class
public class Mobile {
//fields
private	int Number;
private	String Name;
private	double Price;
private static double Offer;

//constructor
public Mobile(int Number,String Name,double Price){
	this.Number = Number;
	this.Name = Name;
	this.Price = Price;
	
}
public void dispMobilePrice(){
	System.out.println("Mobile Price:" +Price);
	
}
public static void displayOffer(){
	System.out.println("Offer Value::" +Offer);
}
}

