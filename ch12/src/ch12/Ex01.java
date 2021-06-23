package ch12;

// Thread 상속 받은 것을 Runnable로 변경하시오
// class Thread3 extends Thread {
class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print('-');
		}
	}
}

public class Ex01 {
	public static void main(String args[]) {
//		Thread3 th1 = new Thread3();
		
		Thread3 th3 = new Thread3();	// Runnable 구현한 클래스 객체를 생성하고
		Thread th1 = new Thread(th3);   // 쓰레드 생성자 매개변수로 객체를 생성한 후에 실행
		th1.run();
	}
}
