package decoratorpattern_updated;

/**
 * 
 * Child Class 
 * 
 * This class will return pure espresso coffee cost w/o including addon things
 *
 */
public class Espresso extends CoffeeWithSize {
	
	public Espresso() {
		description = "Espresso Coffe";  //override base class description
	}
	
	
	@Override
	public double cost() {
		return 100;
	}

}
