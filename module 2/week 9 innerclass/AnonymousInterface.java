package innerclass;

interface piValueDetector{
	public abstract void getPiValue();
}

public class AnonymousInterface  {
	
	public static void main(String[] args) {
		piValueDetector pi = new piValueDetector() {//anonymous inner class
			public void getPiValue() {
				System.out.println("3.14");
			}
		};
		pi.getPiValue();
	}

}
