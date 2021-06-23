package ch12;
class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i =0; i <100;i++) {
			System.out.print("쓰레드"+i+"\t");
			if (i%10 == 9) System.out.println();
			try {
				Thread.sleep(200); // 0.5초 쉬어라
			} catch(InterruptedException e) { }
		}
	}
}

public class Thread1Ex {
	public static void main(String[] args) { 
		Thread1 th1 = new Thread1();
		th1.run();	 // 일반 메소드 실행	
//		th1.start(); // run()메소드를 start()메소드로 실행하면 쓰레드가 발생
		for(int i =0; i <100;i++) {
			System.out.print("메인"+i+"\t");
			if (i%10 == 9) System.out.println();
			try {
				Thread.sleep(200); // 0.5초 쉬어라
			} catch(InterruptedException e) { }
		}
	}
}