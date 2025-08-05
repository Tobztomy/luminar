package iopack;

import java.util.Date;

public class JavaFormator {

	public static void main(String[] args) {
		int amount =100000;
		String str="Luminar Technolab" ;
		Date date=new Date();
		
		System.out.printf("%,d%n",amount);
		System.out.printf("%S\n",str);
		
		//date
		System.out.println(date);
		System.out.printf("%tT%n",date);
		System.out.printf("Hour %tH:minutes %tM:seconds %tS %n",date,date,date);
		
		System.out.printf("%1$tA,%1$tB,%1$tY %n",date );
		
		System.out.printf("%1$td %1$tm %1$ty %n",date );
	}

}
