package project;

public class emp {
	
	
	 String name;
	 int id;
	 String address;
	 void getdata(String name,int id,String address)
	 {
	 this.name=name;
	 this.id=id;
	 this.address=address;
	 }
	 void putdata()
	 {
	 System.out.println("Employee details are :");
	 System.out.println("Name :" +name);
	 System.out.println("ID :" +id);
	 System.out.println("Address :" +address);
	 }
	}



