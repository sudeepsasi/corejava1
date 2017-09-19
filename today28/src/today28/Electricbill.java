package today28;
//class
public class Electricbill {

	//fields
	int Units =240 ;
	double Rate;
	//constructor
	;
	public Electricbill(int Units, double Rate){
		this.Units = Units;
		this.Rate = Rate;
		//methods
		public void calulation(){
				if(Units>100){
					System.out.println("bill is free");
					
				}
				else
				if (Units>200){
					
					Rate = Units*4.50;
					System.out.println("print the bill:" +Rate);
				}
				else
				if(Units>300){
				
					Rate = Units*5.50;
					System.out.println("print the bill:" +Rate);
					
					
				}					
				
				public void payment(){
					System.out.println("pay the bill");
					
				}
				
			
			
		}
		
	}
	
}

