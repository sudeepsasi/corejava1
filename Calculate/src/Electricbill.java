//class
public class Electricbill {
	//fields
private int units;
//constructors
public Electricbill(int units){
this.units = units;
}
public void calculatebill(){
	double billpay = 200   ;

		
	if ( units > 0)
	{
		billpay = units*0;
	}
	
	else
	if (units < 200 )
	{
		billpay =units* 4.50 ;
	}
	else
		if(  units < 300)
		{
			billpay =units* 5.50;	
		}

		System.out.println("electric bill is:" + billpay);
	}
}