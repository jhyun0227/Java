package ch07_1;

public class Person2Ex {
	public static void main(String[] args) {
		Person2[] ps = new Person2[6];
		ps[0] = new Student2("����ũ", 25, "1��");
		ps[1] = new Student2("BTS", 23, "2��");
		ps[2] = new Teacher2("ī�����", 48, "�ڹ�");
		ps[3] = new Teacher2("JYP", 49, "JSP");
		ps[4] = new Manager2("���", 26, "û��");
		ps[5] = new Manager2("����", 37, "����");
		
		for (Person2 p : ps) {
			p.print();
			if (p instanceof Manager2) {
				((Manager2)p).disp();
			}
		}
	}
}
