package ch18;
interface MyFunction1 { // ���ٽĿ��� �ϳ��� �޼ҵ常
	public void method();
}

class MyFun1Class implements MyFunction1 {
	@Override
	public void method() {
		System.out.println("�� �������� Ŭ����");
	}
	
}

public class Lamda1Ex {
	public static void main(String[] args) {
		MyFunction1 mc1 = new MyFun1Class();
		mc1.method();
		mc1 = new MyFunction1() { // ����(�͸�) Ŭ����
			@Override
			public void method() {
				System.out.println("�� �������̽� ���� ������");
			}		
		};
		mc1.method();
		mc1 = ()-> {System.out.println("�� ���ٷ� ó���� �޼���");}; // ���ٽ�
		mc1.method();
	}
}
