package ch18;
@FunctionalInterface
interface MyInter3 {
	int method (int x, int y);
}

public class LamReturn1 {
	public static void main(String[] args) {
		MyInter3 mi;
		mi = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println("��� : " + mi.method(12, 7));
		
		mi = (x,y)-> {return x + y;};
		System.out.println("��� : " + mi.method(12, 11));
		
		mi = (x,y)-> x + y; // ���๮�� ������ �� ������ ��� �߰�ȣ ���� ����
		System.out.println("��� : " + mi.method(21, 11));
	}
}
