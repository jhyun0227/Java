package ch08_1;

// Volume�� �پ��ϰ� ���(������), ������ �Ǵ� overriding ���Ͽ� �پ��ϰ� ����
public interface Volume {
	// �߻�޼ҵ�(�������̵�)
	void volumeUp();
	void volumeDown();
}

class Radio implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("���� ������ �÷���");	
	}

	@Override
	public void volumeDown() {
		System.out.println("���� ������ ������");
	}
	
}

class TV implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("TV ������ �÷���");	
	}

	@Override
	public void volumeDown() {
		System.out.println("TV ������ ������");
	}
}

class Speaker implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("����Ŀ ������ �÷���");	
	}

	@Override
	public void volumeDown() {
		System.out.println("����Ŀ ������ ������");
	}
}