package tests;

import utils.time.Date;

public class DateTest{

	public static void main(String[] args){
		
		System.out.println("Test di utils.Date");

		Date date=new Date(54,34,2014);
		System.out.println("Month is "+date.getMonth());
		System.out.println("Day is "+date.getDay());		
		date.setMonth(-4);
		System.out.println("Month is "+date.getMonth());
		date.setDay(-8);
		System.out.println("Day is "+date.getDay());

		Date date2=new Date(31,1,2014);
		date2.setMonth(2);
		System.out.println("Day is "+date2.getDay());

		Date date3=new Date(31,2,2014);
		System.out.println("Day is "+date3.getDay());
	}
}
