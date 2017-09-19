package com.project.abs2;
import com.project.abs.Director;

public class producer extends Director {
//fields
	String Location;
	
	public producer(String Name,String Location) {
		super(Name);
		this.Location = Location;
	}
		//methods
	public void Hero() {
		System.out.println("hero name is Star");
	}
		public void detailsmovie(){
			System.out.println("movie name:"+Name);
			System.out.println("place locted:"+Location);
			
			
		}
		
		
	}


