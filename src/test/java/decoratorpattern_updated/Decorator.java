package decoratorpattern_updated;

/**
 * All concrete decorators/addons should extend this class
 */
public abstract class Decorator extends CoffeeWithSize{
	
	public CoffeeWithSize coffee;
	public abstract String getDescription();
	
	public Size getSize(){
		return coffee.getSize();
	}
}
