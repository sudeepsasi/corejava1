package oops2;

public class customer {
	
		int cid;
		String cname;
		
		//do not give same attributes names right now.
		void  customer(int id,String name)
		{
			cid =id;
			cname =name;		
		}
		
		void dispcustomerdetails()
		{
			System.out.println("customer id" +cid);
			System.out.println("customer nmae" +cname);
			
			
		
		}
		
		

	}


