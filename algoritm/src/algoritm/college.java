package algoritm;
//class
public class college {
	//fields
	private int cId;
	private String cName;

	
	//constructors
	
	//write here 3 constructors
	
	public college(){
		 cId = 0;
		cName = "";
	}
	public college (int Id){
		cId = Id;
		
	}
	public college (int Id, String Name){
		cId = 0;
		cName = Name;
	}
	public  student(int Id, String Name){
		int cId = Id;
		String cName = Name;
	}
	public student (String Name, int Id){
		String cName= Name;
		int cId = Id;
	}
	
	
}


