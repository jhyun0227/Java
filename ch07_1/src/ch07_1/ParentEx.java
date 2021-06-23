package ch07_1;
class Parent {
	// �ʵ�(�������)
	int x = 100;
	
	// ������
	Parent() { // 4
		this(200); // Parent(int x)�� ȣ�� // 5
	}
	Parent(int x) { // 6
		this.x = x;
	}
	
	// �޼ҵ�(getter)
	int getX() {
		return x;
	}
}

class Child extends Parent {
	// �ʵ�(�������)
	int x = 3000; // 1000
	
	// ������
	Child() { // 2
		this(1000); // Child(int x)�� ȣ��
	}
	Child(int x) { // 3
		System.out.println("c 1 x = " + this.x);
		System.out.println("c 1 x = " + super.x);
		this.x = x;
		System.out.println("c 2 x = " + this.x);
		System.out.println("c 2 x = " + super.x);
	} 
}

public class ParentEx {
	public static void main(String[] args) {
		Child c = new Child(); //1
		// �����ڰ� ��� �����Ǿ�� ��ü�� ��� ����
		System.out.println("x=" + c.getX());
	}
}