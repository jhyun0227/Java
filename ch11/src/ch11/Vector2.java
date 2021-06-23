package ch11;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); // �뷮(capacity)�� 5�� ��ü ����
		vec.add("1"); vec.add("2"); vec.add("3"); // �����͸� �߰��ϴ� �޼ҵ�
		print(vec);
		
		vec.trimToSize(); // ������ ���� ������ �����ϴ� �޼ҵ� (�뷮�� ũ�Ⱑ ������)
		print(vec);
		
		vec.ensureCapacity(6); // ��ü ���� ������ �ø��� �޼ҵ�
		print(vec);
		
		vec.setSize(7); // ������ �Ǽ��� �Ű�������ŭ �ø��� �޼ҵ�, �þ �����Ͱ����� ���ڴ� 0���� ���ڴ� null�� �߰�
		print(vec);     // ��ü ���� ������ ������ �Ǽ��� �ʰ��ϸ� ���� ������ 2��� Ȯ��
		
		vec.clear(); // �����͸� ����, ��������� �������� ����
		print(vec);
	}

	private static void print(Vector<String> vec) {
//		for (String st : vec) {
//			System.out.print(st + "\t");
//		}
		System.out.println(vec); // ��̸���Ʈ, ���� ��� �̷��� ��밡��
		System.out.println("���� : " + vec.size());      // ������ �ִ� ���� ������ �Ǽ�
		System.out.println("���� : " + vec.capacity());  // ��ü ���� ����
	}
}
