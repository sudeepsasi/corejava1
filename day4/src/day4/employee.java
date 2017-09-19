package day4;

public class employee {
	private int eid;
	private String ename;
	
	
	public employee(){
		eid=0;
		ename=" ";
	}
	public employee(int id){
		eid = id;
		ename=" ";
	}
	public employee(int id,String name){
		eid= id;
		ename =name;
	}
	public void dispempdetails(){
		System.out.println("employee id:"+eid);
		System.out.println("employee name:"+ename);
	}
		
		
	}
	


