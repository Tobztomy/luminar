package threadpack;

public class ThreadDemo extends Thread{

	public void run() {
		System.out.println("code in thread");
	}
	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		thread.start();
		System.out.println("in main thread");
	}

}
