package jch06;
class Tv1 {
	String color;
	boolean power;
	int channel;
	
	void power() {};
	void channelUp() {};
	void channelDown() {};
}

public class TvEx {
	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		t1.channel = 7;
		t2 = t1; // t2�� t1�� ���� ����Ǿ� ����Ǵ°��� �ƴϰ� t2�� t1�� ��ü �ּҸ� �����ϰԵǴ� �� �׷��� ������ t2 ��ü�� �����Ǿ���
		System.out.println(t1.channel);
		System.out.println(t2.channel);
			
	}
}
