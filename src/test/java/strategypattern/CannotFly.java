package strategypattern;


/**
 * Class which define how Duck actually cannot fly
 *
 */
public class CannotFly implements Flyable {

	public void fly() {
		System.out.println("I can not fly");
	}

}
