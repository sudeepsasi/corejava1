package testing;

public class test1 {

	public static void main(String[] args) {
		Hotel h1 = new Hotel();
		h1.changeRate(6);
		h1.disphoteldetails();
		
		Hotel h2 = new Hotel(234,"Adyar",78.9);
		h2.changeRate(8);
		 h2.disphoteldetails();
	
	}

}