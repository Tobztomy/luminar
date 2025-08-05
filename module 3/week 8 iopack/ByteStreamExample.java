package iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\demo\\input.txt");
			FileOutputStream fos = new FileOutputStream("D:\\demo\\output.txt");
			int byteData;
			while ((byteData = fis.read()) != -1) {//-1 after end next value(after 0)
				fos.write(byteData);
			}
			System.out.println("File copied successfully.");
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("after i/o operation...");
	}

}
