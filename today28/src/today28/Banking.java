package today28;
//class
public class Banking {
//fields
	int Accountno;
	String Name;
	double Deposit;
	//constructor
  public Banking(){
	this.Accountno = 0;
	this.Name = "";
	this.Deposit = 0;
  }
  public Banking (int Accountno, String Name,double Deposit){
	  this.Accountno = Accountno;
	  this.Name = Name;
	  this.Deposit = Deposit;
  }
  //methods
  public void Savings(){
	  if(Deposit>5000)
	  {
		  System.out.println("this is savings account");
	  }
	  else
		  if(Deposit<5000)
		  {
			  System.out.println("this is current account");
		  }
	  
	  
  }
	
}



