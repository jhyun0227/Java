package ch09;

public class String4 {
	public static void main(String[] args) {
		//            012 345 6789 01234 567 890 12 :���ڼ�(�ε���) 23
		String str = "�츮�� ģ������, �翡 ������ ����� ģ��";
		
		// �ε��� 5���� 10�� �տ����� ���
		String str1 = str.substring(5, 10);
		System.out.println(str1);
		
		System.out.println("===================================");
		
		// ����(" ") �����Ͽ� �迭 strs�� ����� �迭 ������ ���
		String[] strs = str.split(" ");
		for (String st : strs) {
			System.out.println(st);
		
			if (st.endsWith("��")) { // �迭 ������ �߿��� '��'���� ������ �ܾ� ���
				System.out.println("������ ��" + st);
			}
			if (st.startsWith("��")) { // �迭 ������ �߿��� '��'���� �����ϴ� �ܾ� ���
				System.out.println("������ ����" + st);
			}
		}
		
		System.out.println("===================================");
		
		// ���ڸ� ����� ���
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)); // �ش��ϴ� �ε����� ���� ����
		}
		
		System.out.println("\n===================================");
		
		System.out.println(str.indexOf(","));
	}
}
