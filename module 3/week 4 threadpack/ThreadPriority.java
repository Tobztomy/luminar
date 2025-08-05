package threadpack;

class Welcome extends Thread{
	public void run() {
		System.out.println("Welcome");
	}
}
class Luminar extends Thread{
	public void run() {
		System.out.println("Luminar");
	}
}
class Kochi extends Thread{
	public void run() {
		System.out.println("Kochi");
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		Welcome w1= new Welcome();
		Luminar l1=new Luminar();
		Kochi k1 =new Kochi();
		Welcome w2= new Welcome();
		Luminar l2=new Luminar();
		Kochi k2 =new Kochi();
		w1.start();
		l1.start();
		k1.start();
		w2.start();
		l2.start();
		k2.start();
		
		w1.setPriority(5);
		l1.setPriority(1);
		k1.setPriority(10);
		
		w2.setPriority(Thread.MIN_PRIORITY);
		l2.setPriority(Thread.MAX_PRIORITY);
		k2.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(w1.getPriority());
		System.out.println(l1.getPriority());
		System.out.println(k1.getPriority());
		System.out.println(w2.getPriority());
		System.out.println(l2.getPriority());
		System.out.println(k2.getPriority());
	}

}
