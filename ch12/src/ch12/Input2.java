package ch12;

import javax.swing.JOptionPane;

class ThreadTest extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {  }
		}
	}
}

// 동시에 작업을 해도 문제가 없는 작업은 쓰레드로 해야 한다.
public class Input2 {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start();
		String str = JOptionPane.showInputDialog("아무거나 입력해");
		System.out.println("입력한 값 : " + str);
	}
}
