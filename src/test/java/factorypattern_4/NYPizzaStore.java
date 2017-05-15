package factorypattern_4;

/**
 * Factory class
 * 
 * Using base class order method But defining own createPizza
 *
 */
public class NYPizzaStore extends PizzaStore {


	@Override
	public Pizza createPizza(String str) {

		if(str.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(str.equals("veg")){
			return new NYStyleVegPizza();
		}else return null;
	}

}
