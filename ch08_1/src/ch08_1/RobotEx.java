package ch08_1;

public class RobotEx {
	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
		((DanceRobot)r).dance();
		} else if (r instanceof SingRobot) {
			((SingRobot)r).sing();
			} else if (r instanceof DrawRobot) {
				((DrawRobot)r).draw();
			}
	}
	
	public static void main(String[] args) {
		Robot[] robots = new Robot[3];
		robots[0] = new DanceRobot();
		robots[1] = new SingRobot();
		robots[2] = new DrawRobot();
		
		for (Robot robot : robots) {
			action(robot);
		}
	}
}