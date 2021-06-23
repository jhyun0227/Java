package ch11;

import java.util.Stack;

public class Stack1 { // 벡터의 밑에 있는 리스트 컬렉션
	public static void main(String[] args) {
		String[] nations = {"미국", "중국", "한국", "영국", "종국", "떡국"};
		
		// 후입 선출
		Stack<String> stack = new Stack<>();
		for (String nation : nations) {
			stack.push(nation); // 데이터 저장 명령
		}
		
		while (! stack.isEmpty()) { // 데이터 없으면 종료 있으면 실행 !데이터없음
			System.out.println(stack.pop());
		}
	}
}
