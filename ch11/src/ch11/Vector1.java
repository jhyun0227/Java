package ch11;

import java.util.Vector;

public class Vector1 { // ����Ʈ �÷���
	public static void main(String[] args) {
		Vector<String> Arry3 = new Vector<>();
		Arry3.add("������"); Arry3.add("�ȷ���"); Arry3.add("������");
		Arry3.add("������"); Arry3.add("������");
		prn(Arry3);
		// �ε��� 1���� ������ �߰��ϰ� ���
		Arry3.add(1, "������"); prn(Arry3);
		// �ε��� 3���� ��������� �����ϰ� ���
		Arry3.set(3, "�����"); prn(Arry3);
		// �ε��� 2�� ������ ����� ���
		Arry3.remove(2);      prn(Arry3);
		// ������ ����� ���
		Arry3.remove("������"); prn(Arry3);
	}

	private static void prn(Vector<String> Arry3) {
		for (String Arry : Arry3) {
			System.out.print(Arry + "\t");
		}
		System.out.println();
	}
}
