package ch06_1;
public class Single1 {
//	static�� �ִ� ������ Ŭ������ �ε��� �� �ѹ��� ����
	private static Single1 instance = new Single1();
// 	������ �տ� private�� �ٿ��� ���� �����ڸ� ȣ�� ���ϰ� ���
	Single1() {	}
// ó���� ������ ������ instance�� ���� ���
// ��ü�� ������ ���� getInstance() �޼��带 ���Ͽ� ����
	public static Single1 getInstance() {
		return instance;
	}
}