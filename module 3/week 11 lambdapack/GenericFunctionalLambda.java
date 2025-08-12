package lambdapack;

@FunctionalInterface
interface GenericMyInterface<T> {
	T method(T t);
}

public class GenericFunctionalLambda {

	public static void main(String[] args) {
		GenericMyInterface<String> reverseString = (str) -> {// lambda expression
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);

			}
			return result;
		};
		System.out.println("String reversed " + reverseString.method("Luminar"));

		GenericMyInterface<Integer> factorial = (no) -> {// lambda expression
			int result = 1;
			for (int i = 1; i <= no; i++) {
				result = i * result;

			}
			return result;
		};
		System.out.println("factorial " + factorial.method(5));

		GenericMyInterface<Integer> reverseNo = (num) -> {// lambda expression
			int m = 0, rev = 0;
			while (num > 0) {
				m = num % 10;
				rev = (rev * 10) + m;
				num = num / 10;

			}
			return rev;
		};
		System.out.println("number reverse " + reverseNo.method(512));

	}

}
