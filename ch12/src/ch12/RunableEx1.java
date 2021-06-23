package ch12;
// class Run1 extends Object, Thread { } �ڹٴ� ���� ����� �Ұ���
// ���� ��� ������ Thread�� ��ӹ��� �� ���� �� ��ü�� Runnable�� ����
class Run1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			// Thread.currentThread().getName() ���� �۾����� ������ �̸�
			System.out.println(Thread.currentThread().getName() + i + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
	}
}

public class RunableEx1 {
	public static void main(String[] args) {
	Run1 r1 = new Run1();
	Run1 r2 = new Run1();
	Run1 r3 = new Run1();
	
	// Runnable�� ��쿡�� Thread�� �����ؼ� ����ؾ� �Ѵ�.
	Thread th1 = new Thread(r1, "1��"); // ������ �̸� �߰�
	Thread th2 = new Thread(r2, "2��");
	Thread th3 = new Thread(r3, "3��");
	
	th1.start(); th2.start(); th3.start();
	}
}
