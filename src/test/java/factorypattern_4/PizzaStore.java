package factorypattern_4;

/**
 * Base Store class defined how to order a pizza\
 * 
 * ref: https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/factory/pizzafm
 */
public abstract class PizzaStore {

	//franchise are free to add local flavor
	public abstract Pizza createPizza(String type);
	
	//rest of the task should be as per standard way only
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
