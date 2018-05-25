package singletonpattern;

public enum Singleton {
	
	INSTANCE;
	String name;
	
	Singleton(){}

	public String getName() {
		return name;
	}
	
	public void doMyWayOnly(){
		System.out.println("My Way");
	}
}
