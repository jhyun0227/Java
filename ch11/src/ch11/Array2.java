package ch11;

import java.util.ArrayList;

public class Array2 {
	 public static void main(String[] args) {
		// �迭���� ������ �߰�, ������ ����. �ӵ��� �迭�� ������.
		ArrayList<String> al = new ArrayList<>();
		al.add("���"); al.add("����"); al.add("�ٳ���");
		al.add("����"); al.add("����");
		prn(al);
		al.add(2, "Ű��"); // 2�� �ε����� Ű�� �߰� 2���� �ڿ��ִ� �����Ͱ� �ϳ��� �ڷ� �и�
		prn(al); // 2���� �ڿ��ִ� �����Ͱ� �ε��� �ϳ��� �ڷ� �и� 
		al.set(4, "����");  // 4�� �ε����� ��ü
		prn(al);
		al.remove(1); // �ش��ϴ� �ε��� ������ �������� �ϳ��� �����
		prn(al);
		al.remove("���");
		prn(al);
	}
	 
	 private static void prn(ArrayList<String> al) {
		for (String fruit : al) {
			System.out.print(fruit + "\t");
		}
		System.out.println();
		
	}
}
