package ch12;

import java.util.ArrayList;

public class AfterThread1 extends Thread {
	public AfterThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(getName() + "½ÇÇà");
		ArrayList<String> carList = JoinTest.carList;
		for (String str : carList)
			System.out.println(str);
	}
}
