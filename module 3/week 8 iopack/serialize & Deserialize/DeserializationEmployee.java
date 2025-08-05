package iopack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationEmployee {

	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\demo\\demo.txt"));
			Employee emp = (Employee) in.readObject(); // typecaste
			System.out.println(emp);
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
