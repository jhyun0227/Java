package ch02;

public class RelationOp1 {

	public static void main(String[] args) {
		int i1 = 10, i2 = 20;
		boolean b1 = i1 == i2; // �� �������� ����� true or false, �� false
		System.out.println("b1 = " + b1);
		b1 = i1 != i2; // false -> true
		System.out.println("b1 = " + b1);
		b1 = i1 > i2; // true -> false
		System.out.println("b1 = " + b1);
		b1 = i1 >= i2; // false
		System.out.println("b1 = " + b1);
		b1 = i1 < i2; // false -> true
		System.out.println("b1 = " + b1);
		b1 = i1 <= i2; // true
		System.out.println("b1 = " + b1);
	}
}

// ������ ���� �̸����� �����ϸ� �ȵ�