package ch02;

public class TriOp2 {
	public static void main(String[] args) {
		int cnt = 247;
		int cntperpage = 10;
		
		// int page = cnt / cntperpage; // ���� / ������ �ϸ� ����� ����
		//                 ����           ?      true      :       false
		int page = cnt % cntperpage == 0 ? cnt/cntperpage : cnt/cntperpage + 1; // ���׿�����
	
		System.out.println("�� ������ �� : " + page );
	}
}
