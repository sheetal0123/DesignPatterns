package singletonpattern;

public class TestSingletonEnum{

	public static void main(String[] args) {
		Singleton.INSTANCE.name = "Apple";
		System.out.println(Singleton.INSTANCE.getName());
		
		Singleton.INSTANCE.doMyWayOnly();
	}

}

