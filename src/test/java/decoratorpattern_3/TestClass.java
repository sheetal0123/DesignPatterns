package decoratorpattern_3;

public class TestClass {

	public static void main(String[] args) {

		//plain coffe
		Coffee obj1 = new Espresso();
		System.out.println(obj1.getDescription() + " : " + obj1.cost());  // Espresso Coffe : 100.0
		
		//with mocha
		Coffee obj2 = new Espresso();
		obj2 = new MochaDecorator(obj2);
		System.out.println(obj2.getDescription() + " : " + obj2.cost());  // Espresso Coffe, with Mocha : 120.0
		
		//with extra milk
		Coffee obj3 = new Espresso();
		obj3 = new MilkDecorator(obj3);
		System.out.println(obj3.getDescription() + " : " + obj3.cost());  // Espresso Coffe, with Milk : 110.0
		
		//with double mocha flavor
		Coffee obj4 = new Espresso();
		obj4 = new MochaDecorator(obj4);
		obj4 = new MochaDecorator(obj4);
		System.out.println(obj4.getDescription() + " : " + obj4.cost());  // Espresso Coffe, with Mocha, with Mocha : 140.0
		
	}
}
