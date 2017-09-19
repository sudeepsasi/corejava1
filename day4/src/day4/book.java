package day4;
public class book {
	
	private int pages;
	private String bname;
	//constructors
	public book(){
		pages = 0;
		bname = " ";
	
}
 public book  (String name){
	 pages = 0;
	 bname = name;
 }
 public book (int page, String name){
	 pages = page;
	 bname = name;
 }
 //methods
 public void dispbookdetails()
 {
	 System.out.println("book page:"+pages);
	 System.out.println("book name:"+bname);
	 
 }
}
