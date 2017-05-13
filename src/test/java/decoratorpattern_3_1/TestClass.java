package decoratorpattern_3_1;

import decoratorpattern_3_1.CoffeeWithSize.Size;

public class TestClass {

	public static void main(String[] args) {

		//plain coffee
		CoffeeWithSize obj1 = new Espresso();
		System.out.println(obj1.getDescription() + " : " + obj1.cost());  // Espresso Coffe : 100.0
		
		//with default size 
		CoffeeWithSize obj2 = new Espresso();
		obj2 = new MochaDecorator(obj2);
		System.out.println(obj2.getDescription() + " : " + obj2.cost());  // Espresso Coffe, with Mocha - Large : 120.0
		
		//with medium mocha
		CoffeeWithSize obj3 = new Espresso();
		obj3.setSize(Size.MEDIUM);
		obj3 = new MochaDecorator(obj3);
		System.out.println(obj3.getDescription() + " : " + obj3.cost());  // Espresso Coffe, with Mocha - Medium : 115.0
				
	
	}
}
