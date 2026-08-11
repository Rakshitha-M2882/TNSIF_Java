package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registerable s=new Student();
		Registerable s1=new Student();
		
		Object obj=new Object();
		
		if(obj instanceof Registerable)
		{
			System.out.println("Student is registered for this course");
			
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
		

	}

}