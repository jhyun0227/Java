package ch06_1;

public class Student {
	// �������
	String name;
	int kor, eng, math;
	
	// ������
	Student() {};
	Student(String name, int kor, int eng, int math) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	} // �̸��� ���� �� this.������� = �ν��Ͻ����� �� ����Ŵ  this�� ��ü�� ����ħ
	
	// �޼ҵ�
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		float avg = getTotal() / 3.0f;
		return avg;
	}
	
	void print() {
		System.out.println("==================================");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + getTotal());
		System.out.println("��� : " + getAverage());
		}
	}
