package ch07;

public class Inher4 {
	public static void main(String[] args) {
		// ��ü ����
		// �θ�Ŭ������ ������
		// �����ڴ� �θ�Ŭ���� ���� �����
		D3 d3 = new D3();
		
		// �θ�Ŭ������ �ʵ�(�������) ���
		System.out.println("str1 = " + d3.str1);
		System.out.println("str2 = " + d3.str2);
		System.out.println("str3 = " + d3.str3);
		
		// �θ�Ŭ������ �޼ҵ� ���
		d3.m1();
		d3.m2();
		d3.m3();
		
		System.out.println("=======================");
		
		// �ڽ� Ŭ������ �ʵ�(�������)�� �޼ҵ�� ����� �Ұ����ϴ�.
		D1 d1 = new D1();
		System.out.println("str1 = " + d1.str1);
//		System.out.println("str2 = " + d1.str2);
//		System.out.println("str3 = " + d1.str3);
		
		d1.m1();
//		d1.m2();
//		d1.m3();
	}
}
