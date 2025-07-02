package callbypack;

public class CallByValue {
	public int sum(int first, int second) {
		return first+second;
	}

	public static void main(String[] args) {
		int first=2;
		int second=3;
		CallByValue obj =new CallByValue();
		System.out.println(obj.sum(first, second));
	}

}
