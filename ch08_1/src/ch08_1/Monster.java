package ch08_1;
interface Bird {
	void eat();
}

// implements �ڿ��� �������� �������̽��� ����� �� �ִ�.
public class Monster extends Person2 implements Fish, Bird {	
	@Override // �������̵��� main�� �ۿ� 
	public void eat() {
		System.out.println("�θ��� �ɾ� �Դ�.");
	}

	@Override // �������̵��� main�� �ۿ�
	public void swim() {
		System.out.println("���ӿ��� ��ð� ���ģ��.");
	}
}	