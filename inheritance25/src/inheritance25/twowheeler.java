package inheritance25;

public  class twowheeler extends Vehicles {
	//fields
	private int No;
	
	//constructor
	
	public twowheeler(String Design,double Rate,int No){
		super(Design, Rate);
		this.No = No;
	}
	//methods
	public void Milage(){
		System.out.println("two wheeler Milage");
	}
	public void speed(){
		System.out.println("two wheeler Speed");
	}

}
