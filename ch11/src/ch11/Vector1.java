package ch11;

import java.util.Vector;

public class Vector1 { // 리스트 컬렉션
	public static void main(String[] args) {
		Vector<String> Arry3 = new Vector<>();
		Arry3.add("구렁이"); Arry3.add("팔렁이"); Arry3.add("질렁이");
		Arry3.add("육렁이"); Arry3.add("구렁이");
		prn(Arry3);
		// 인덱스 1번에 구렁삼 추가하고 출력
		Arry3.add(1, "구렁삼"); prn(Arry3);
		// 인덱스 3번에 도룡룡으로 수정하고 출력
		Arry3.set(3, "도룡룡"); prn(Arry3);
		// 인덱스 2번 데이터 지우고 출력
		Arry3.remove(2);      prn(Arry3);
		// 구렁이 지우고 출력
		Arry3.remove("구렁이"); prn(Arry3);
	}

	private static void prn(Vector<String> Arry3) {
		for (String Arry : Arry3) {
			System.out.print(Arry + "\t");
		}
		System.out.println();
	}
}
