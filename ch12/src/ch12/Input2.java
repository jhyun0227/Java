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

// ���ÿ� �۾��� �ص� ������ ���� �۾��� ������� �ؾ� �Ѵ�.
public class Input2 {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start();
		String str = JOptionPane.showInputDialog("�ƹ��ų� �Է���");
		System.out.println("�Է��� �� : " + str);
	}
}
