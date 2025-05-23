class LogicalDemo {
	public static void main(String args[]) {
		int numOne=70;
		int numTwo=20;
		int numThree=15;
		System.out.println((numOne > numTwo) && (numOne > numThree));
		System.out.println((numOne > numTwo) || (numThree > numTwo));			System.out.println((numOne < numTwo) || (numTwo > numThree));			System.out.println(!(numOne == numTwo));					System.out.println(!(numTwo > numThree));

	}

}