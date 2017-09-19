package today18;

public class cust {
	private int cage;
	private String cgender;
	private static int count;
	public  cust(int age, String gender ){
		cage= age;
		cgender=gender;
		count++;
	}
	public void dispStudentData(){
		System.out.println("cust Number:"+cage);
		System.out.println("cust Name:"+cgender);
	}
	public static void displaycount(){
		System.out.println("count values is:"+count);
		


}
}