package inheritance25;
//class
public class Transport {
//fields
	public String Name;
    public	double Rate;
    
    //constructors
    public Transport(String Name, double Rate){
    	this.Name = Name;
    	this.Rate = Rate;
    	
    }
    //methods
    public void Vehicles(){
    	System.out.println("Disp Name:" +Name);
    	System.out.println("Disp Rate:" +Rate);
    }
	

}
