

public class test {

	public static void main(String[] args) {
		course c1 = new course();
		c1.dispCorseDetails();
		
		course c2 = new course(100,"ece");
		c2.dispCorseDetails();
		
		course c3 = new course(100,"csc",5000.0);
		c3.dispCorseDetails();
    
    
	}

}

