package com.project.interf;
import  com.project.inter.Shopkeeper;

public class Customer implements Shopkeeper {
	//fields
	double pay;
	//constructors
	public Customer(double pay){
		this.pay = pay;
		
	}
	//methods
	public void textiles(){
		System.out.println("pay money for cotton:"+pay);
		
	}
	
	

}
