package ch11;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		// binarySearch�� sort�� �Բ� ��� �۵���
		Integer[] scores = {99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε��� : " + index);
		
		String[] names = {"ȫ�浿", "�ڹ���", "��ö��"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε��� : " + index);
		
		// ��ü�� �����ϰ� ã��
		Member1 m1 = new Member1("ȫ�浿");
		Member1 m2 = new Member1("�ڹ���");
		Member1 m3 = new Member1("��ö��");
		Member1[] members = {m1, m2, m3};
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		index = Arrays.binarySearch(members, m2);
		System.out.println("ã�� �ε��� : " + index);
	}
}
