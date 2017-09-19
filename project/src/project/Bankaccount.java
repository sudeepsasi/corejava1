package project;
//class
public class Bankaccount {
	//fields
	 
	private double Balance_check,Deposit,Withdraw;
	
	//constructor
	public Bankaccount(double Deposit,double Withdraw){
		this.Deposit = Deposit;
		this.Withdraw = Withdraw;
	}
	//methods
	public void savings(){
		System.out.println("amount deposit:"+Deposit);
		System.out.println("amount drawn:"+Withdraw);
		
	}
	public void checkamount(){
		Balance_check = Deposit-Withdraw;
		System.out.println("total amount:"+Balance_check);
	}
	
	
	

}
