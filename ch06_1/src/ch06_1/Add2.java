package ch06_1;
public class Add2 {
	public static void main(String[] args) {
		int result = add(10,20); // 내부클래스의 메소드 사용하는 것이기 때문에 메소드명만으로 호출
		System.out.println("결과 : " +  result);
		System.out.println("결과 : " + add(10.5, 7.3));
	}
	
	
	private static int add(int i, int j) {
		return i + j;
	}
	
	private static double add(double d, double e) {
		return d + e;
	}
}

// private 접근 제어자 로 해당 클래스에서만 사용 가능하고 다른 객체에서는 접근이 불가능
// static 클래스