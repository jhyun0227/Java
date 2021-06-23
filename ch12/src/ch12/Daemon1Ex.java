package ch12;
class Daemon1 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("����");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
}

public class Daemon1Ex {
	public static void main(String[] args) {
		Daemon1 dm = new Daemon1();
		// ���� �۾��� ������ ��� �����嵵 �����϶�, start() �޼ҵ� �տ� �־�� �Ѵ�.
		dm.setDaemon(true);
		dm.start();
		for (int i = 1; i < 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
}
