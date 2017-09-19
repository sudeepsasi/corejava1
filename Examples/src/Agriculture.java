//class
public class Agriculture {
//fields
	private String Name;
	 private int Products;
	 private double Payment;
	 
	 //constructors
	 
	 public Agriculture(int Product, double Payment){
		 this.Products = Product;
		 this.Payment = Payment;
	 }
	 public Agriculture(String Name, int Product,double Payment){
		 this.Name = Name;
		 this.Products = Products;
		 this.Payment = Payment;
	 }
	 //methods
	 public void paymentdetails(double payment){
		 this.Payment = Payment;
	 }
	 public int Productsnames(){
		 return Products;
	 }
				 
	 }
	 
		 
	 

