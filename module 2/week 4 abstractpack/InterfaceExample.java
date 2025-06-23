package abstractpack;

interface demoInterface{
	public abstract void showDetails(int id,String name);
}


public class InterfaceExample implements demoInterface {
	
public void showDetails(int id,String name) {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		InterfaceExample obj= new InterfaceExample();
		obj.showDetails(11,"tobin");

	}

}
