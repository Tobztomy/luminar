package genericpack;

public class GenericType<T> {
	private T t;
	

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


	public static void main(String[] args) {
		GenericType<Integer> obj1=new GenericType<>();
		obj1.setT(23);
		System.out.println(obj1.getT());
		GenericType<Float> obj2=new GenericType<>();
		obj2.setT(3.14f);
		System.out.println(obj2.getT());
		GenericType<String> obj3=new GenericType<>();
		obj3.setT("Luminar");
		System.out.println(obj3.getT());
	}

}
