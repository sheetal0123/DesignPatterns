package decoratorpattern_3;

/**
 * This class will return pure espresso coffee cost w/o including addon things
 *
 */
public class Espresso extends Coffee {

	public Espresso() {
		description = "Espresso Coffe";  //updating base class variable
	}
	
	
	@Override
	public double cost() {
		return 100;
	}

}
