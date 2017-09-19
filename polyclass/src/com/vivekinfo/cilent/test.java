package com.vivekinfo.cilent;

import com.vivekinfo.polydemo.Employee;
import com.vivekinfo.polydemo.Manager;

public class test {

	public static void main(String[] args) {
		Object o1 = new Object();
		
		
		Employee e1 = new Employee();
		
		Object obj = new Employee();
		
		Employee e2 = (Employee) obj;
		
		String str = e2.toString();
		System.out.println("str");
	

	}

}
