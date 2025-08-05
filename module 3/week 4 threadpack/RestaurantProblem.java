package threadpack;

class FoodItem {
	String foodItemName;

	FoodItem(String foodName) {
		this.foodItemName = foodName;
	}

	public String getFoodItemName() {
		return foodItemName;
	}

}

class Supplier {
	String supplierName;

	Supplier(String supplierName) {
		this.supplierName = supplierName;
	}

	public synchronized void deliverFood(FoodItem food, String customerName) {
		System.out.println("Supplier " + supplierName + " is delivering " + food.getFoodItemName() + " to " + customerName);
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(customerName + " received the " + food.getFoodItemName());

	}

	public String getSupplierName() {
		return supplierName;
	}

}

class Customer extends Thread {
	String customerName;
	FoodItem food;
	Supplier supplier;

	Customer(String customerName, FoodItem food, Supplier supplier) {
		this.customerName = customerName;
		this.food = food;
		this.supplier = supplier;
	}

	public void run() {
		System.out.println(customerName + " has ordered " + food.getFoodItemName());
		supplier.deliverFood(food, customerName);

	}
}

public class RestaurantProblem {

	public static void main(String[] args) {

		FoodItem foodItemOne = new FoodItem("pizza");
		FoodItem foodItemTwo = new FoodItem("burger");
		FoodItem foodItemThree = new FoodItem("Sandwitch");


		Supplier supplierOne = new Supplier("Arun");
		Supplier supplierTwo  = new Supplier("Kevin");
		Supplier supplierThree = new Supplier("Manu");



		Customer customerOne = new Customer("Jiya", foodItemOne, supplierOne);
		Customer customerTwo  = new Customer("Aswin", foodItemTwo, supplierOne);
		Customer customerThree = new Customer("Arjun", foodItemOne, supplierOne);
		Customer customerFour = new Customer("Merin", foodItemThree, supplierThree);
		Customer customerFive = new Customer("Joyal", foodItemTwo, supplierTwo);



		customerOne.start();
		customerTwo.start();
		customerThree.start();
		customerFour.start();
		customerFive.start();
	}

}
