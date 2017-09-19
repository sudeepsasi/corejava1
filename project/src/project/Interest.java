package project;
//class
public class Interest {
//fields
	
private int  p,t;
private double r,i;

//constructor

public Interest(int p,double r,int t){
	this.p = p;
	this.r = r;
	this.t = t;
}
//methods
public void calculationinterest(){
	i = (int) (p*r*t);
	System.out.println("final amount for 3 years:"+i);
}
public void totalamount(){
	double Amount;
	Amount = p+i;
	System.out.println("final total:"+Amount);
}

}


