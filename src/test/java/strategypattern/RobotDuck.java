package strategypattern;

/**
 * Robot Duck can fly with rocket power
 * 
 * Subclass:
 * Override swim, display behavior which are common among all sub type of Duck 
 */
public class RobotDuck extends Duck {

	/**
	 * Constructor initialized with CAN fly behavior
	 */
	public RobotDuck(){
		flyable = new CanFly();
	}
	
	@Override
	public void swim() {
		System.out.println("Robot Duck can swim easily");
	}

	@Override
	public void display() {
		System.out.println("Robot Duck looks Robotic");
	}

}
