package strategypattern;

/**
 * 
 * Fat Duck can't fly	
 *
 * Subclass:
 * Override swim, display behavior which are common among all sub type of Duck 
 *
 */
public class FatDuck extends Duck {

	/**
	 * Constructor initialized with CANNOT fly behavior
	 * Hence Fat Duck cannot fly
	 */
	public FatDuck(){
		flyable = new CannotFly();
	}
	
	@Override
	public void swim() {
		System.out.println("Fat Duck can swim easily");
	}

	@Override
	public void display() {
		System.out.println("Fat Duck looks Fatty");
	}

}
