class FibonacciSeries {
    	public static void main(String[] args) {
        	int first = 0; 
		int second = 1;
		int next;

        	System.out.println("First 20 Fibonacci numbers:");
        
        	for (int i = 1; i <= 20; i++) {
            		System.out.print(first + " ");
            		next = first + second;
            		first = second;
            		second = next;
        	}
    	}
}
