package factorypattern_4;

/**
 * Factory class
 * 
 * Using base class order method But defining own createPizza
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String str) {

		if (str.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else
			return null;
	}

}
