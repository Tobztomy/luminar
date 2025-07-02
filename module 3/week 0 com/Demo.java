package com;

public class Demo {

	public static void main(String[] args) {
		int data=50;
		int result;
		try {
			result=data/0;	
			System.out.println(result);
		}catch(ArithmeticException ex) {
			//System.out.println("error");
			//System.out.println(ex.getMessage());
			//System.err.println("error");
			//ex.printStackTrace();//best practice
		}
		
		System.out.println("rest of the code");
	}

}
