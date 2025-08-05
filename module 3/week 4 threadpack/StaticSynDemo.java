package threadpack;

class ResourceTable {
	synchronized static void printTable(int no) {// resource of class
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

class One extends Thread {

	public void run() {
		ResourceTable.printTable(50);
	}
}

class Two extends Thread {

	public void run() {
		ResourceTable.printTable(9);
	}
}


public class StaticSynDemo {

	public static void main(String[] args) {
		One t1 = new One();
		Two t2 = new Two();
		t1.start();
		t2.start();

	}

}
