package ch11;

public class Member2 implements Comparable<Member2> {
	String name;
	int age;
	
	public Member2(String name, int age) {
		this.name = name; this.age = age;
	}

	@Override
	// ���ϴ� ������ ����
	public int compareTo(Member2 o) {
		String age1 = age + ""; 	// �� ����� ���ڿ�
		String age2 = o.age + "";
		return age1.compareTo(age2);
//		return name.compareTo(o.name);
	}
	public String toString() {
		return name + "(" + age + ")";
	}
}
