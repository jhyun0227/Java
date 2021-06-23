package ch09_1;
enum SchoolType { // 클래스 아니고 데이터타입
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}

class Student1 {  // 클래스임
	// 필드(멤버변수)
	SchoolType school;
	
	// 생성자
	public Student1(SchoolType school) {
		this.school = school;
	}
}

public class EnumTest {
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("초딩");
		
		SchoolType[] schools = SchoolType.values(); // 값을 읽을때 사용
		for (SchoolType school : schools) {
			//                   값				   인덱스 번호
			System.out.println(school + " : " + school.ordinal());
		}
		}
	}
}
