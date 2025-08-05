package threadpack;

class Table {
	// synchronized void printTable(int no) {//resource of class
	void printTable(int no) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(no * i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

//=======================
class MyThreadOne extends Thread {
	Table t;

	MyThreadOne(Table obj) {
		t = obj;

	}

	public void run() {
		t.printTable(7);
	}
}

class MyThreadTwo extends Thread {
	Table t;

	MyThreadTwo(Table obj) {
		t = obj;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization {

	public static void main(String[] args) {
		Table obj = new Table();
		MyThreadOne t1 = new MyThreadOne(obj);
		MyThreadTwo t2 = new MyThreadTwo(obj);

		t1.start();
		t2.start();
	}

}
