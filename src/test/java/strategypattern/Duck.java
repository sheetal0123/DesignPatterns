package strategypattern;


public abstract class Duck {

	Flyable flyable;

	/**
	 * to set fly behavior at run time
	 */
	public void setFlyBehaviour(Flyable f){
		flyable = f;
	}
	
	
	/**
	 * Duck is not define behavior
	 * Duck delegate work to Flyable interface
	 */
	public void performFly(){
		flyable.fly();
	}
	
	public abstract void swim();
	public abstract void display();
	
	
}
