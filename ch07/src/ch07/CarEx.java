package ch07;

public class CarEx {
	public static void main(String[] args) {
		Bus bus = new Bus("����", 40);
		FireEngine fe = new FireEngine("�ҹ���", 10);
		Ambulance am = new Ambulance("������", 6);
		
		bus.printBus();
		fe.printFe();
		am.printAm();
	}
}
