package threadpack;

class ThreadKochi extends Thread{
	public void run() {
		while(true) {
			System.out.println("Kochi");
		}
	}
}
class ThreadLuminar extends Thread{
	public void run() {
		while(true) {
			System.out.println("Luminar");
		}
	}
}
public class LuminarKochiThreadTest {

	public static void main(String[] args) {
		ThreadKochi kochi = new ThreadKochi();
		ThreadLuminar luminar =new ThreadLuminar();
		kochi.start();
		luminar.start();
	}

}
