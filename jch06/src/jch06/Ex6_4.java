package jch06;
class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result; 
	 // return a + b; // ���� ������ �̿� ���� ������ �� �� �ִ�.
		}
		
		long substract(long a, long b) {
			return a - b;
		}
		
		long multiply(long a, long b) {
			return a * b;
		}
		
		double divide(long a, long b) {
			return a / b;
		}
		
		long max(long a, long b) {
			if(a > b) {
				return a; // ���ǽ��� ���϶��� ����
			} else {
				return b; // ���ǽ��� �����϶� ����
			}
		}
		
		void printGugudan(int dan) {
			if (!(2 <= dan && dan <= 9)) {
				return; // �Է� ���� ��(dan)�� 2~9�� �ƴϸ�, �޼ҵ� �����ϰ� ���ư���
			}
			
			for (int i = 1; i<=9 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
//			return; ����Ÿ���� void�� ��� �������� return���� ���������ϴ�. ����Ÿ���� �ƴҰ�� ���� ��ȯ�ؾ��ϱ� ������ �ʼ�
		}
}


public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // add�޼ҵ� ȣ�� 
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(12); // ������ 3���� ���
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
