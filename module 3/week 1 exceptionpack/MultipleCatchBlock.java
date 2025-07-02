package exceptionpack;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int ar[] = new int[5];
		try {
			ar[5] = 30 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array IndexOut Of Bounds Exception occurs");
		} catch (Exception ex) {
			System.out.println("parent Exception occurs");
		}
		System.out.println("rest of the code");
	}

}
