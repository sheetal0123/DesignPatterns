package decoratorpattern_updated;

/**
 * This class will return pure espresso coffee cost w/o including addon things
 *
 */
public class Espresso extends CoffeeWithSize {
	
	public Espresso() {
		description = "Espresso Coffe";  //updating base class variable
	}
	
	
	@Override
	public double cost() {
		return 100;
	}

}
