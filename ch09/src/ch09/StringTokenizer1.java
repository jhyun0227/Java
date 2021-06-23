package ch09;

import java.util.StringTokenizer;

public class StringTokenizer1 {
	public static void main(String[] args) {
		// 문자열을 ', '로 구별해서 담아라                                         delemiter
		StringTokenizer st = new StringTokenizer("사과, 바나나, 귤, 오렌지, 키위", ", ");
		while (st.hasMoreTokens()) { // 토큰이 있으면 
			// 차례대로 다음 토큰을 가져와라
			System.out.println(st.nextToken());
		}
	}
}
