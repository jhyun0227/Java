package ch02;

public class OpSp5 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		// Math.round : �Ǽ��� �ݿø��Ͽ� ������ ����
		float shortPi = Math.round(pi * 1000) / 1000f;
		// Math.round(3141.592f) / 1000f
		// 3142 / 1000f => 3142.0f / 1000f => 3.142
		System.out.println("shortPi = " + shortPi);
	}
}

/* ������ ��� byte ���� byte�� �⺻���� int�� ������ Ÿ���� �ٲ����� 
 * �Ǽ��� ��� float ���� float�� �⺻���� double�� ���� �ʴ´�.*/
