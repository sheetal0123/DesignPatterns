package strategypattern;

/**
 * Class which define how Duck actually fly
 *
 */
public class CanFly implements Flyable {

	public void fly() {
		System.out.println("I can fly");
	}

}
