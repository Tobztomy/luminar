package com.array;

public class CommandLineDemo {

	public static void main(String[] args) {
		System.out.println("first args " + args[0]);
		System.out.println("for loop");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("enhanced for loop");
		for (String str : args)
			System.out.println(str);

	}

}
