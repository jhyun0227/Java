package ch06_1;

public class Student {
	// 멤버변수
	String name;
	int kor, eng, math;
	
	// 생성자
	Student() {};
	Student(String name, int kor, int eng, int math) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	} // 이름이 같을 때 this.멤버변수 = 인스턴스변수 를 가르킴  this는 객체를 가르침
	
	// 메소드
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		float avg = getTotal() / 3.0f;
		return avg;
	}
	
	void print() {
		System.out.println("==================================");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + getTotal());
		System.out.println("평균 : " + getAverage());
		}
	}
