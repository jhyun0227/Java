package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 { // ����Ʈ �÷���
	public static void main(String[] args) {
//		���׸�(Generic) al1���� ���ڿ��� ����
//		�Ϲݹ迭���� �ٸ��� ������ ������ ������ ����
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("������"); al1.add("�ȷ���"); al1.add("ĥ����"); // add�� �߰��Ҷ� ���
		al1.add("������"); al1.add("������");
		System.out.println("������ �Ǽ� : " + al1.size());
		
		for(int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i)); // �ش��ϴ� �ε��� ������ �������� get() �޼ҵ� ���� ������
		}
		System.out.println("=============================");
		for (String snake : al1) {
			System.out.println(snake);
		}
		Iterator<String> its = al1.iterator(); // Iterator �������� al1�� �ִ� ������ �����Ͽ� ����
		while(its.hasNext()) { // ���� �����͸� ������ �ִ�
			System.out.println(its.next()); // ���� �����͸� ������ �ͼ� ���
		}
	}
}