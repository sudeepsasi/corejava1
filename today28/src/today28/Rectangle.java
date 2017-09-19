package today28;

public class Rectangle {
	//fields
	
private  double  Length;
private  double Breadth;

//constructor

public Rectangle (double Length,double Breadth){
	this.Length = Length;
	this.Breadth = Breadth;
}
public Rectangle (int Length, int Breadth){
	this.Length = Length;
	this.Breadth = Breadth;
	
}
//methods


public double mul(){
  double mul =   Length*Breadth;
  return mul;
	
}
	public  int mul(){
		 int mul = (int) (Length*Breadth);
		 return mul;

	}
}


	


