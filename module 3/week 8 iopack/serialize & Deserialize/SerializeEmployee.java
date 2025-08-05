package iopack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try {
			Employee s1 =new Employee(211,"bini");
			Employee s2 =new Employee(215,"manu");
			fout =new FileOutputStream("D:\\demo\\demo.txt"); 
			out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fout.close();
				out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("write the object");
	}

}
