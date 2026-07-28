package org.tnsif.acc.c2tc.oops;

class device{
	void deviceType()
	{
		System.out.println("I am an electronic device");
	}
}
class Phone extends device
{
	void brand()
	{
		System.out.println("Brand:+samsung");
	}
}
class SmartPhone extends Phone{
	void feature()
	{
		System.out.println("Features,Touchscreen,Camera,Internet");
	}
}

public class MuliLevelInheritanceDemo {

	public static void main(String[] args) {
		SmartPhone smart=new SmartPhone();
		smart.deviceType();
		smart.brand();
		smart.feature();
	}

}
