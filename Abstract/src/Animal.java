
public abstract class Animal {
	
	//fields
	private int TagId;
	private String Name;
	
	
	//constructor
	
	public Animal(){
		TagId = 0;
		Name = "";
	}
		
	public Animal(int TagId, String Name){
		
		
		 this.TagId = TagId;
		 this.Name = Name;
	}
	//methods
	public abstract void eat();
	public abstract void sleep();
	
	public void  display(){
		System.out.println("Animals TagId:" +TagId);
		System.out.println("Animals Name:" +Name);
		
	

		}
		


}
