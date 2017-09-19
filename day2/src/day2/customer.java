package day2;

public class customer {
	String email;
	 String custname;
	 String mobileno;

public void registercustomer(String mail,String name,String mobile){
    email = mail;
    custname = name;
    mobileno = mobile;
	
}

public void dispemaiid(){
System.out.println("customer emailid"+email);
}
}

9