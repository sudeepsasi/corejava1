
public class Box {
	//fields
	private int bLength;
	private int bBreadth;
	private int bHeight;
	
	
	//constructors
	public Box(){
		bLength = 0;	//????/
		 bBreadth = 0;
		 bHeight = 0;
	}
	public Box(int Length, int Breadth, int Height){
		 bLength = Length;
		 bBreadth = Breadth;
		 bHeight = Height;
	}
	
	
		//this.Height = Height;
	
	// methods
	public void dispBox(){
    	 int areaofbox = bLength*bBreadth*bHeight;
    	
		System.out.println("Length of Box:" +bLength);
		System.out.println("Breadth of Box:"+bBreadth);
		System.out.println("Height of Box:" +bHeight);
		System.out.println("Area of Box:" +areaofbox);
	}

}
