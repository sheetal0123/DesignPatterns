package decoratorpattern_3;

/**
 * This is addon flavor class and will add its flavor cost to
 * overall cost So if Espresso cost 100 then it will return 100+20 = 120
 * 
 */
public class MilkDecorator extends Decorator{

	Coffee coffee;

	// Constructor will accept Coffee type i.e Espresso, Latte etc
	public MilkDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public String getDescription() {
		return coffee.getDescription() + ", with Milk";
	}

	public double cost() {
		return coffee.cost() + 10;
	}
}
