package ch11;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5); // 용량(capacity)이 5인 객체 생성
		vec.add("1"); vec.add("2"); vec.add("3"); // 데이터를 추가하는 메소드
		print(vec);
		
		vec.trimToSize(); // 데이터 없는 공간을 삭제하는 메소드 (용량과 크기가 같아짐)
		print(vec);
		
		vec.ensureCapacity(6); // 전체 저장 공간을 늘리는 메소드
		print(vec);
		
		vec.setSize(7); // 데이터 건수를 매개변수만큼 늘리는 메소드, 늘어난 데이터공간에 숫자는 0으로 문자는 null로 추가
		print(vec);     // 전체 저장 공간을 데이터 건수가 초과하면 저장 공간을 2배로 확장
		
		vec.clear(); // 데이터를 삭제, 저장공간은 삭제되지 않음
		print(vec);
	}

	private static void print(Vector<String> vec) {
//		for (String st : vec) {
//			System.out.print(st + "\t");
//		}
		System.out.println(vec); // 어레이리스트, 벡터 모두 이렇게 사용가능
		System.out.println("갯수 : " + vec.size());      // 가지고 있는 실제 데이터 건수
		System.out.println("갯수 : " + vec.capacity());  // 전체 저장 공간
	}
}
