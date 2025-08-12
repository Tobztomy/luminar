package genericpack;

class GenType<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class Utility {

	public static <T> boolean isEqual(GenType<T> obj1, GenType<T> obj2) {

		return obj1.get().equals(obj2.get());
	}

	public static void main(String[] args) {

		GenType<String> g1 = new GenType<>();
		g1.set("Bini");

		GenType<String> g2 = new GenType<>();
		g2.set("bini");

		boolean flag = Utility.<String>isEqual(g1, g2);

		if (flag)
			System.out.println("strings are equal");
		else
			System.out.println("strings are not equal");

		GenType<Integer> g3 = new GenType<>();
		g3.set(45);
		GenType<Integer> g4 = new GenType<>();
		g4.set(45);
		boolean isEqual = Utility.<Integer>isEqual(g3, g4);
		if (isEqual)
			System.out.println("strings are equal");
		else
			System.out.println("strings are not equal");

	}

}
