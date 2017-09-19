package today18;

public class hotel {
	private int hRate;
	private String hItem;
	private static int count;
	public  hotel(int Rate, String Item ){
		hRate = Rate;
		hItem = Item;
		count++;
	}
	public void disphotelData(){
		System.out.println("Show Rate:"+hRate);
		System.out.println("Item Name:"+hItem);
	}
	public static void displaycount(){
		System.out.println("count values is:"+count);
		


	}

}