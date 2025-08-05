package threadpack;

public class DaemonThread extends Thread{

	public DaemonThread(String name) {
		super(name);//thread class
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" is Daemon Thread");
		}else {
			System.out.println(getName()+ " is user thread");
		}
	}
	
	public static void main(String[] args) {
		DaemonThread thread1=new DaemonThread("thread1");
		DaemonThread thread2=new DaemonThread("thread2");
		
		thread1.setDaemon(true);
		
		thread1.start();
		thread2.start();;
	}

}
