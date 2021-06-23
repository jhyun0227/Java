package ch11;

import java.util.LinkedList;

public class Queue1 { // stack과 다르게 선입선출, 링크드리스트 클래스 위
	public static void main(String[] args) {
		String[] fruits = {"사과", "딸기", "포도", "바나나"};
		
		LinkedList<String> que = new LinkedList<>();
		
		for (String fruit : fruits) {
			que.offer(fruit);
		}
		
		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}
