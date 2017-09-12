import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot r = new Robot("batman");
		r.setSpeed(100);
r.penDown();
	r.setAngle(0);
	r.move(200);
	r.setAngle(90);
		for (int i = 0; i < 180; i++) {
			r.penDown();
r.move(1);
			r.turn(1);
	}
	
}
}