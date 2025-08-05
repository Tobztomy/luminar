package threadpack;

public class ThreadDemoInterface implements Runnable{
	public void run() {
		System.out.println("code in thread");
	}
	public static void main(String[] args) {
		ThreadDemoInterface obj = new ThreadDemoInterface();
		
		Thread t =new Thread(obj);
		t.start();
		
		
		
	}

}
