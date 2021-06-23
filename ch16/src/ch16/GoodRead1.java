package ch16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GoodRead1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("stock1.txt"));
			while(true) {
				GoodStock1 gs = (GoodStock1)ois.readObject();
				System.out.println(gs);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
