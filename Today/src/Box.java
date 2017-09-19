//class
public class Box {
	
//fields	
private int Length;
private int Breadth;
private int Height;
private int AreaofBox;


//constructors

public Box(int Length, int Breadth, int Height){
this.Length = Length;
this.Breadth = Breadth;
this.Height = Height;
}
public Box(){
	this.Length = 0;
	this.Breadth = 0;
	this.Height = 0;
}
//methods
public void AreaofBox(int Length, int Breadth, int Height){
	this.Length = Length;
	this.Breadth = Breadth;
	this.Height = Height;
}
public void displayAreaofBox(){
	this.AreaofBox = Length*Breadth*Height;
	System.out.println("Area of BOX:" +Length);
	System.out.println("Area of BOX:" +Breadth);
	System.out.println("Area of Box:" +Height);
}
public int showmeLength(){

	return Length;
}
public void ChangeBreadth(int Breadth){
	this.Breadth = "Breadth";
	


	
}

}

