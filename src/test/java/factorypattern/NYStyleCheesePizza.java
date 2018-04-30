package factorypattern;

/**
 * Franchise are free to add their own local flavor using prepare method
 *
 */
public class NYStyleCheesePizza extends Pizza{

	public NYStyleCheesePizza(){
		name = "Done with NY Style cheese pizza";
	}

	@Override
	void prepare() {
		System.out.println("Preparing NY style thin crust CHEESE pizza with less cheese and white sause");
	}
	
}
