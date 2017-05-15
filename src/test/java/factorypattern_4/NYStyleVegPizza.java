package factorypattern_4;

/**
 * Franchise are free to add their own local flavor using prepare method
 *
 */
public class NYStyleVegPizza extends Pizza {

	public NYStyleVegPizza() {
		name = "Done with NY Style veg pizza";
	}

	@Override
	void prepare() {
		System.out.println("Preparing NY style thin crust VEG pizza with less cheese and white sause");
	}

}
