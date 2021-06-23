package ch16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GoodWrite1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stock1.txt"));
		oos.writeObject(new GoodStock1("111", 100));
		oos.writeObject(new GoodStock1("222", 150));
		oos.writeObject(new GoodStock1("333", 220));
		oos.close();
		System.out.println("저장 완료");
	}
}
