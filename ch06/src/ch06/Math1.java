package ch06;
class A1 {
// ��ȯ�� �޼����   �Ű�����
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
// ����������
	public void prn() { // �����		
		System.out.println("�����ΰ�"); // ������
	}
}
public class Math1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.prn();
		//������ �ݺ��Ǵ� �۾��� ��������
		a1.add(12 ,5);
		a1.add(25 ,30);
		a1.add(8 ,62);
	}
}
