package decoratorpattern_3_1;

/**
 * This is addon flavor class and will add its flavor cost to overall cost So if
 * Espresso cost 100 then it will return 100+20 = 120
 * 
 */
public class MochaDecorator extends Decorator {

	CoffeeWithSize coffee;

	public MochaDecorator(CoffeeWithSize coffee) {
		this.coffee = coffee;
	}

	public String getDescription() {
		String desc = coffee.getDescription() + ", with Mocha";

		if (coffee.getSize() == Size.LARGE) {
			desc = desc + " - Large";
		} else if (coffee.getSize() == Size.MEDIUM) {
			desc = desc + " - Medium";
		} else if (coffee.getSize() == Size.SMALL) {
			desc = desc + " - Small";
		}

		return desc;
	}

	public double cost() {
		double cost = coffee.cost();

		if (coffee.getSize() == Size.LARGE) {
			cost = cost + 20;
		} else if (coffee.getSize() == Size.MEDIUM) {
			cost = cost + 15;
		} else if (coffee.getSize() == Size.SMALL) {
			cost = cost + 10;
		}

		return cost;
	}
}
