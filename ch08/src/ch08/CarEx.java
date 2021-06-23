package ch08;

public class CarEx {
	public static void main(String[] args) {
	Car[] cars = {new Ambulance(), new FireEngine(), new Bus()};
	
	for (int i = 0; i < cars.length; i++) {
		cars[i].move();
		if (cars[i] instanceof Bus) {
			((Bus)cars[i]).inwon();
		}
	}
	}
}
