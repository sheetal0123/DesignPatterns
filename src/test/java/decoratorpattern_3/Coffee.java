package decoratorpattern_3;

/**
 * Base class or Abstract Component class
 * Every concrete component class and decorator class should extend this class 
 * 
 * Decorator pattern:
 * Decorators class(Mocha decorator) has the same type as the class they are decorating(Espresso)
 * Decorator are good design pattern where we are adding addon features to common feature
 */
public abstract class Coffee {

	String description = "unknow cofee type";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}
