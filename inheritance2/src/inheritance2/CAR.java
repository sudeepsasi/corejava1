package inheritance2;

public class CAR extends Vehicles {
	//Fields
	//constants
	public CAR(int No,String Name){
		super(No,Name);
	}
	//methods
	public void speed(){
		System.out.println("CAR SPEED...");
		
	}
	public void mileage(){
		System.out.println("CAR MILEAGE...");
		
	}

}
