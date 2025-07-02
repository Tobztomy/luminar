package exceptionpack;

public class TestFinallyBlock {

	public static void main(String[] args) {
		int data;
		try {
			data = 25 / 0;
			System.out.println(data);
		/*} catch (Exception ex) {
			ex.printStackTrace();*/
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");//this will not print if catch not given

	}

}
