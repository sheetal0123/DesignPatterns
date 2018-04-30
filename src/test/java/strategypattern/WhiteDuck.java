package strategypattern;

/**
 * White Duck can fly 
 * 
 * Subclass:
 * Override swim, display behavior which are common among all sub type of Duck 
 *
 */
public class WhiteDuck extends Duck {

	
	/**
	 * Constructor initialized with CAN fly behavior
	 */
	public WhiteDuck(){
		flyable = new CanFly();
	}
	
	@Override
	public void swim() {
		System.out.println("White Duck can swim easily");
	}

	@Override
	public void display() {
		System.out.println("White Duck looks White");
	}

}
