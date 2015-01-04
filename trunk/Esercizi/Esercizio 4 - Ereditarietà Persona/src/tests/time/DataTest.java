package tests.time;

import time.Data;

public class DataTest {
	
	public static void main(String[] args) {
		
		Data data1 = new Data(31, 4, 2012);
		System.out.println(data1.toString());

		data1.setMese(2);
		System.out.println(data1.toString());

		data1.setAnno(2009);
		System.out.println(data1.toString());
	}

}
