package ch12;
class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i =0; i <100;i++) {
			System.out.print("������"+i+"\t");
			if (i%10 == 9) System.out.println();
			try {
				Thread.sleep(200); // 0.5�� �����
			} catch(InterruptedException e) { }
		}
	}
}

public class Thread1Ex {
	public static void main(String[] args) { 
		Thread1 th1 = new Thread1();
		th1.run();	 // �Ϲ� �޼ҵ� ����	
//		th1.start(); // run()�޼ҵ带 start()�޼ҵ�� �����ϸ� �����尡 �߻�
		for(int i =0; i <100;i++) {
			System.out.print("����"+i+"\t");
			if (i%10 == 9) System.out.println();
			try {
				Thread.sleep(200); // 0.5�� �����
			} catch(InterruptedException e) { }
		}
	}
}