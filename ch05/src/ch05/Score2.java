package ch05;

public class Score2 {
	String name;  // ������� (��ü����)
	int kor, eng, math;

// ������ ���� Score() { }
	
	void print() {
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(kor + eng + math + "\t");
		System.out.print((kor + eng + math)/3);
	}
}
