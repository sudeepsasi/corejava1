package today28;

public class Ticket {
	double rate,tax,discount;
	//constructor
	public Ticket(double rate, double tax, double discount){
		this.rate = rate;
		this.tax = tax;
		this.discount = discount;
	}
	//methods
	public void showticketdetails(){
		System.out.println("ticket rate:"+rate);
		System.out.println("ticket tax:"+tax);
		System.out.println("ticket discount:"+discount);
	}
	public void ticketcalculation(){
		double Amount;
		 Amount = rate+tax-discount;
		System.out.println("print amount:"+Amount);
		
		
	}
}
