package ch08_1;
class SCV extends GroundUnit implements Repairable{
	SCV() { 	super(60);	hitPoint = MAX_HP;	}
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println( u.toString() + "의 수리가 끝났습니다.");
		}
	}
}
public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank); // SCV가 Tank를 수리하도록 한다.
		scv.repair(dropship);
//		scv.repair(marine); // Reparable 구현하지 않해서 에러 발생		
	}
}