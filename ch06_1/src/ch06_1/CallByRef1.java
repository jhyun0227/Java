package ch06_1;
class D1 {
	public void m1(int[] k) {
		k[0] = 77; // 전달된 주소를 찾아가 데이터를 변경
		k[1] = 88;
		for (int i = 0; i < k.length; i++) {
			System.out.println("num[" + i + "] = " + k[i]);
		}
	}
}

public class CallByRef1 {
	public static void main(String[] args) {
		int[] num = {12, 34};
		D1 d1 = new D1();
		d1.m1(num); // 참조형 변수 일때는 주소를 전달
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
}

// 데이터가 참조변수일 경우에는 주소를 전달하기 때문에 값도 바뀌게 된다.
