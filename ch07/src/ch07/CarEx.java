package ch07;

public class CarEx {
	public static void main(String[] args) {
		Bus bus = new Bus("버스", 40);
		FireEngine fe = new FireEngine("소방차", 10);
		Ambulance am = new Ambulance("구급차", 6);
		
		bus.printBus();
		fe.printFe();
		am.printAm();
	}
}
