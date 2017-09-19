//class
public class Rectangle {

	//fields
	private int Length;
	private int Width;
	private double AreaofRecentangle;


	//constructors
	
	public Rectangle(){
		this.Length = 0;
		this.Width = 0;
	
	}
	public Rectangle(int length){
		this.Length = Length;
		this.Width  = 0;
		
	}
	public Rectangle(int Length, int Width){
		this.Length = Length;
		this.Width = Width;
	}
	//methods
	public void dispAreaofRectangle(){
		this.AreaofRecentangle = Length*Width;
		System.out.println("Length value:" +Length);
		System.out.println("Width value:" +Width);
	}
	public void AreaofRectangle(int AreaofRectangle){
		System.out.println("Show me Area:" +AreaofRectangle);
		
		
	}
	
	

		public double AreaofRectangle(int Length, int Width){
		AreaofRecentangle = Length*Width;
		System.out.println("Area of Rectangle"+AreaofRecentangle);
		return AreaofRecentangle;		
		}
		

		

		public double AreaofRectangle(double Length, double Width){
		AreaofRecentangle =  Length*Width;
		System.out.println("Area of Rectangle:"+AreaofRecentangle);
       	return AreaofRecentangle;
	}



	
	
	
	
}
