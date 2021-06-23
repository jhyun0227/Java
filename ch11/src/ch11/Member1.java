package ch11;
// 객체를 정열하기 위해서는 Comparable 인터페이스를 구현해야 한다.
public class Member1 implements Comparable<Member1> {
	// 필드(멤버변수)
	String name;
	
	// 생성자
	public Member1 (String name) {
		this.name = name;
	}
	
    // 메소드
	// 정열할 기준을 재정의 한다.	
	@Override
	public int compareTo(Member1 o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
