package jch06;

public class Ex6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel �� : " + t1.channel);
		System.out.println("t2�� channel �� : " + t2.channel);
		
		t1.channel = 7;
		System.out.println("t1�� channel �� : " + t1.channel);
		System.out.println("t2�� channel �� : " + t2.channel);
		
		t2 = t1; // �������� t1�� ���� t2�� ����
		// t2�� t1�� ���� ����Ǿ� ����Ǵ°��� �ƴϰ� t2�� t1�� ��ü �ּҸ� �����ϰԵǴ� �� �׷��� ������ t2 ��ü�� �����Ǿ���
		System.out.println("t1�� channel �� : " + t1.channel);
		System.out.println("t2�� channel �� : " + t2.channel);
	}
}
