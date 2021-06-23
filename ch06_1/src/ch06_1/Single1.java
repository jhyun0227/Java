package ch06_1;
public class Single1 {
//	static이 있는 실행은 클래스가 로딩될 때 한번만 실행
	private static Single1 instance = new Single1();
// 	생성자 앞에 private을 붙여서 직접 생성자를 호출 못하게 방어
	Single1() {	}
// 처음에 생성된 생성자 instance를 같이 사용
// 객체를 생성할 때는 getInstance() 메서드를 통하여 생성
	public static Single1 getInstance() {
		return instance;
	}
}