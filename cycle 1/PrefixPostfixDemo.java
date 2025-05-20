class PrefixPostfixDemo {
	public static void main(String args[]) {
		int i=5;
		int j=i++;
		int m=12;
		int n=m--;
		System.out.println("i & j "+i+" & "+j);
		System.out.println("m & n "+m+" & "+n);
		j=++i;
		System.out.println("i & j "+i+" & "+j);
		n=--m;
		System.out.println("m & n "+m+" & "+n);

	}

}