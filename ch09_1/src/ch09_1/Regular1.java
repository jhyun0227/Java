package ch09_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular1 {
	public static void main(String[] args) {
		 String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car","combat","count", "date", "disc"};
		 //                          c로 시작하고 다음글자가  영소문자 a~z
		 Pattern p = Pattern.compile("c[a-z]*"); // 검색 조건
		  // c로 시작하는 소문자영단어
		 for(int i=0; i < data.length; i++) {
			 Matcher m = p.matcher(data[i]);
			 if(m.matches()) { // 검색 조건이 맞으면
				 System.out.print(data[i] + ",");
			 }
		}
	}
}
