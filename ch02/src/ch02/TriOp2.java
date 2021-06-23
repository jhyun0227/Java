package ch02;

public class TriOp2 {
	public static void main(String[] args) {
		int cnt = 247;
		int cntperpage = 10;
		
		// int page = cnt / cntperpage; // 정수 / 정수를 하면 결과도 정수
		//                 조건           ?      true      :       false
		int page = cnt % cntperpage == 0 ? cnt/cntperpage : cnt/cntperpage + 1; // 삼항연산자
	
		System.out.println("총 페이지 수 : " + page );
	}
}
