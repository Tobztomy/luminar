package threadpack;

class Customers extends Thread {
    public void run() {
        try {
            System.out.println("Customer ordering food");
            Thread.sleep(2000); // Wait for food to be served
            System.out.println("Customer eating food");
            Thread.sleep(2500);
            System.out.println("Finished eating.Thank you.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Waiter extends Thread {
    public void run() {
        try {
        	System.out.println("Waiter giving order to chef");
            Thread.sleep(1600); // Start after chef finishes
            System.out.println("Waiter Serving food to customer");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Chef extends Thread {
    public void run() {
        try {      
            Thread.sleep(500); //receiving order
            System.out.println("Chef Preparing food");
            Thread.sleep(1000); //time to cook
            System.out.println("Food is ready, waiter can collect");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Restaurant {

	public static void main(String[] args) {
        Customers customer = new Customers();
        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        
        customer.start();
        waiter.start();
        chef.start();
       
        
	}

}
