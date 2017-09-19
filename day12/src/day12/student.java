package day12;

public class student {
		private int sno;
		private String sname;
		private static int count;
		public  student(int id, String name){
			sno= id;
			sname=name;
			count++;
		}
		public void dispStudentData(){
			System.out.println("Student Number:"+sno);
			System.out.println("Student Name:"+sname);
		}
		public static void displaycount(){
			System.out.println("count values is:"+count);
			
			
		}
		

	}


