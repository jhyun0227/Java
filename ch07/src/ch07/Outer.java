package ch07;

public class Outer {
	// �ʵ�(�������)
	private int height;
	private int width;
	
	// ������
	public Outer(int height, int width) {
		this.height = height; this.width = width;
	}
	
	// �޼ҵ� (getter)
	public Inner getInner() {
		return new Inner();
	}
	
	// Inner class�� �ܺ� Ŭ������ �������, �޼ҵ带 �ڱ�� ó�� ���
	// �����ϵ� Ŭ������ �ܺ�Ŭ����.class �� �ܺ�Ŭ����$����Ŭ����.class �ΰ��� ����
	class Inner { // Ŭ���� �ȿ� �ִ� Ŭ����(���� Ŭ����)
		private float rate = 0.5f;
		
		
		public float volume() {
			return rate * height * width;
		}
	}
}
