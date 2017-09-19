package oopsdy1;

public class student
{
int sno;
String sname;
void registrationstudent(int id,String name){
sno =id;
sname =name;
}

void dispstudentdata(){

	System.out.println("student number"+sno);
	System.out.println("student name"+sname);
}
}

