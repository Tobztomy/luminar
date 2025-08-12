package enumpack;

enum Size{
	SMALL,MEDIUM,LARGE,EXTRA_LARGE;
}
class Test{
	Size pizzaSize;
	Test(Size pizzaSize){
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		
		case SMALL:
			System.out.println("SMALL pizza ordered");
			break;
		case MEDIUM:
			System.out.println("MEDIUM pizza ordered");
			break;
		case LARGE:
			System.out.println("LARGE pizza ordered");
			break;
		case EXTRA_LARGE:
			System.out.println("EXTRA LARGE pizza ordered");
			break;
		default:
			System.out.println("no pizza ordered");
			break;
		}
	}
}
public class EnumDemo {

	public static void main(String[] args) {
		Test test=new Test(Size.SMALL);
		test.orderPizza();
	}

}
