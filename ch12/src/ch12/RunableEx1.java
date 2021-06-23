package ch12;
// class Run1 extends Object, Thread { } 자바는 다중 상속이 불가능
// 다중 상속 등으로 Thread를 상속받을 수 없을 때 대체로 Runnable을 구현
class Run1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			// Thread.currentThread().getName() 현재 작업중인 쓰레드 이름
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
	
	// Runnable의 경우에는 Thread를 생성해서 사용해야 한다.
	Thread th1 = new Thread(r1, "1번"); // 스레드 이름 추가
	Thread th2 = new Thread(r2, "2번");
	Thread th3 = new Thread(r3, "3번");
	
	th1.start(); th2.start(); th3.start();
	}
}
