package ch06_1;
class D1 {
	public void m1(int[] k) {
		k[0] = 77; // ���޵� �ּҸ� ã�ư� �����͸� ����
		k[1] = 88;
		for (int i = 0; i < k.length; i++) {
			System.out.println("num[" + i + "] = " + k[i]);
		}
	}
}

public class CallByRef1 {
	public static void main(String[] args) {
		int[] num = {12, 34};
		D1 d1 = new D1();
		d1.m1(num); // ������ ���� �϶��� �ּҸ� ����
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
}

// �����Ͱ� ���������� ��쿡�� �ּҸ� �����ϱ� ������ ���� �ٲ�� �ȴ�.
