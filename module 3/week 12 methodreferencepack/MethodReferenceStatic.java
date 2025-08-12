package methodreferencepack;

@FunctionalInterface
interface Demo {
	public void print(String str);
}

public class MethodReferenceStatic {

	public static void display(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Demo d = MethodReferenceStatic::display;
		d.print("Tobin");

		Demo d1 = (str) -> {
			System.out.println(str);
		};
		d1.print("manu");
	}

}
