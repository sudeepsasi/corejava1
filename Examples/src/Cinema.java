//class
public class Cinema {
//fields
	private int Slno;
	private String Name;
	private double Budget;
	
	
	//constructors
	public Cinema(){
		this. Slno = 0;
		this.Name = "";
		this.Budget = 0;
	}
	public Cinema(int Slno, String Name, double Budget){
		this.Slno = Slno;
		this.Name = Name;
		this.Budget = Budget;
		
	}
	//methods
	public void showBudget(double Budget){
		this.Budget = Budget;
		
	}
	public String HeroName(){
		return Name;
		
	}
	
	
	
	
}
