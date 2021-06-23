package ch16;

import java.io.Serializable;
// Serializable을 구현하지 않은 직열화를 만들 수 없다.
public class GoodStock1 implements Serializable {
	String code;
//	int num;
//	transient 숫자는 0, 문자는 null 저장 된다.
	transient int num;
	
	GoodStock1(String code, int num) {
		this.code = code; this.num = num;
	}
	
	@Override
	public String toString() {
		return "주식[코드:" + code + ", 수량:" + num + "]";
	}
}
