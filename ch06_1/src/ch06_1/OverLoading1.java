package ch06_1;
class E2 {
	// �޼ҵ� �����ε�
	int add(int x, int y) {
		return x + y;
	}
	
//	int add(int a, int b) { // �������� �ٸ� ���� �ȵǰ� (�Ű����� ������ Ÿ�԰� ����)
//		return x + y;
//	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	String add(String name) {
		return "�ȳ��ϼ��� " + name + "��";
	}
}

public class OverLoading1 {
	public static void main(String[] args) {
		E2 e = new E2();
		System.out.println(e.add(12, 15));   // �Ű������� ���� �����ϴ� �޼ҵ尡 �ٸ���.
		System.out.println(e.add(3.6, 7.2));
		System.out.println(e.add("ö��"));
	}
}
