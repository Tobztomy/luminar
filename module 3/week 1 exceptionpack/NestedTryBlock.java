package exceptionpack;

public class NestedTryBlock {
	public static void main(String[] args) {
		int num;
		int[] ar = new int[5];
		try {
			try {
				num=30/0;
			}catch(ArithmeticException ae) {
				ae.printStackTrace();
				
			}
			try {
				ar[5]=67;
			}catch(ArrayIndexOutOfBoundsException ai) {
				ai.printStackTrace();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("my prg executed completely");
	}
}
