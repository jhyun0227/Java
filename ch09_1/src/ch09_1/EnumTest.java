package ch09_1;
enum SchoolType { // Ŭ���� �ƴϰ� ������Ÿ��
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}

class Student1 {  // Ŭ������
	// �ʵ�(�������)
	SchoolType school;
	
	// ������
	public Student1(SchoolType school) {
		this.school = school;
	}
}

public class EnumTest {
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("�ʵ�");
		
		SchoolType[] schools = SchoolType.values(); // ���� ������ ���
		for (SchoolType school : schools) {
			//                   ��				   �ε��� ��ȣ
			System.out.println(school + " : " + school.ordinal());
		}
		}
	}
}