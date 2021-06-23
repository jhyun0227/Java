package ch16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOut1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"));
		oos.writeObject(new GregorianCalendar(2021, 4, 10));
		oos.writeObject(new GregorianCalendar(2021, 4, 11));
		oos.writeObject(new GregorianCalendar(2021, 4, 12));
		oos.close();
		System.out.println("직열화 완료");
	}
}
