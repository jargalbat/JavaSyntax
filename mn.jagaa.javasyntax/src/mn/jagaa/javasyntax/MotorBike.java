package mn.jagaa.javasyntax;

public class MotorBike {
	// Constructors
	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		setSpeed(speed);
	}

	// State
	private int speed; // member variable

	// Behavior (Зан төлөв)
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) { // local variable
		if (speed > 0) { // validation
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("Started");
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

}
