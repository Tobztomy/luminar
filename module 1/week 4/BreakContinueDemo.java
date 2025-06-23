package com.luminar;

public class BreakContinueDemo {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			/*
			 * if(i%2==0) 
			 * continue;
			 *  System.out.println(i);
			 */
			for(int j=1;j<=4;j++) {
				if(j==3) {
					/* continue; */
					break;
				}
				System.out.println(i+" "+j);
			}
			System.out.println("");
		}

	}

}
