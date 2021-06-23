package pac;

public class One {
	// 필드(멤버변수)
	protected String one; // 프로텍트 접근제한자는 같은 패키지 or 다른패키지일 경우 상속받은 클래스만 접근가능
	
	// 메소드
	protected String getOne() {
		one = "one";
		return one;
	}
}