package ch01; // ch01패키지 안에 HelloJava라는 프로그램을 만듬

// class HelloJava  HelloJava라는 java 프로그램, 클래스 정의
// HelloJava라는 파일명과 HelloJava 자바 프로그램명이 같아야 main이 실행
public class HelloJava {  // {는 자바 class 시작
	
	// main : 메서드명인데 자바 가상머신(JVM)이 호출할 수 있는 진입점
	// public : 아무나 이 프로그램을 실행시킬 수 있다
	// void 반환형 : 아무것도 반환할 것이 없다, 실행만 하고 종료
	// main메서드 javascript function 유사
	public static void main (String[] args) { // {는 main이라는 메서드 시작
		
		// 큰 따옴표 안에 있는 문정을 그대로 출력
		System.out.println("Hello Java"); // ;는 자바 문장 종료
		// println = ln line의 약자로 출력 후에 한줄 떼라
		System.out.println("대박 사건");
	} // }는 main이라는 메서드 끝
} // }는 자바 class 끝

/*~*/ // 범위주석 컨트롤 키 + 쉬프트 키 + 물음표 동시에 누르면 주석처리
// // 한줄주석
/** 자바 API에 반영
 * 
 * 
 */

