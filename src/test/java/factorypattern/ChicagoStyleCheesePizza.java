package factorypattern;

/**
 * Franchise are free to add their own local flavor using prepare method
 *
 * Here we are cutting in different way
 * 
 * If we want to enforce standard cut behaviour then we can make cut() method as final in Pizza class
 */
public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza(){
		name = "Done with Chicago Style cheese pizza";
	}
	
	
	@Override
	void prepare() {
		System.out.println("Preparing Chicago style thick base CHEESE pizza with more cheese and red sause");
	}
	
	
	@Override
	public void cut(){
		System.out.println("Cutting pizza chicago way ... XXX");
	}
	
}
