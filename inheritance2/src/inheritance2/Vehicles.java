package inheritance2;

public abstract class Vehicles {
	//fields
	private int No;
	private String Name;
	
	//constructor
	public Vehicles(){
	No=0;
	Name="";
	}
	public Vehicles (int No, String Name){
		this.No = No;
		this.Name = Name;
	}
	//methods
	public abstract void speed();
	public abstract void mileage();
	
	public void display(){
		System.out.println("Vehicles No" + No);
		System.out.println("Vehicles Name"+ Name );
	
	}
	

}
