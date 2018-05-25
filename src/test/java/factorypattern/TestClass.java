package factorypattern;

public class TestClass {

	public static void main(String[] args) {

		PizzaStore nystore = new NYPizzaStore();
		Pizza nycheesepizza = nystore.orderPizza("cheese");
		System.out.println(nycheesepizza.getName());

		System.out.println("-----------------------------------");
		Pizza nyvegpizza = nystore.orderPizza("veg");
		System.out.println(nyvegpizza.getName());
		
		System.out.println("-----------------------------------");
		PizzaStore chstore = new ChicagoPizzaStore();
		Pizza chcheesepizza = chstore.orderPizza("cheese");
		System.out.println(chcheesepizza.getName());
	}
}