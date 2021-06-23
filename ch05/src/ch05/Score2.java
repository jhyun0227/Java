package ch05;

public class Score2 {
	String name;  // 멤버변수 (객체변수)
	int kor, eng, math;

// 생성자 생략 Score() { }
	
	void print() {
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(kor + eng + math + "\t");
		System.out.print((kor + eng + math)/3);
	}
}
