package ch12;
// 멀티쓰레드 : 하나의 프로세스에서 각 작업이 동시에 실행
class Thread2 extends Thread {
	public Thread2(String title) { // Thread 제목
		super(title);
	}
	// run을 재정의 해야 작동
	public void run() {
		for(int i =0; i <100;i++) {
			System.out.print(getName()+i+"\t");
			if (i%10 == 9) System.out.println();
			try {		Thread.sleep(200); // 0,2 쉬어라 1/1000초 단위
			} catch (InterruptedException e) {	}
		}
	}
}

public class Thread1Ex2 {
	public static void main(String[] args) { 
		Thread2 th1 = new Thread2("th1");
		Thread2 th2 = new Thread2("th2");
		th1.start(); th2.start();  // thread로 시작
//		th1.run();   th2.run();
		for(int i =0; i <100;i++) {
			System.out.print("메인"+i+"\t");
			if (i%10 == 9) System.out.println();
			try {		Thread.sleep(200); // 0,2 쉬어라
			} catch (InterruptedException e) {	}
		}
	}
}