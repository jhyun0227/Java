package ch11;

import java.util.LinkedList;

public class Queue1 { // stack�� �ٸ��� ���Լ���, ��ũ�帮��Ʈ Ŭ���� ��
	public static void main(String[] args) {
		String[] fruits = {"���", "����", "����", "�ٳ���"};
		
		LinkedList<String> que = new LinkedList<>();
		
		for (String fruit : fruits) {
			que.offer(fruit);
		}
		
		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}