package ch11;
class FruitBox2<T> {
	T item;
	
	public void store(T item) {
		this.item = item;
	}
	
	public Object pullout() {
		return item;
	}
}

public class FruitBox1Ex2 {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
		fb.store(new Orange(10));
		Orange og1 = (Orange)fb.pullout();
		og1.showSugar();
//		���׸��� ����ϸ� ���α׷� �ۼ��� �� ���� üũ
//		fb.store(new Apple(8));
//		// �������� ���� �������� ������ �� ������ �߻�
//		Orange og2 = (Orange)fb.pullout();
//		og2.showSugar();
	}
}
