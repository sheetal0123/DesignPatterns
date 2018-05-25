package factorypattern2;

public class MainClassWithFactory {

	public static void main(String[] args) {
		OSFactory fact = new OSFactory();
		OS obj = fact.getInstance("win");
//		OS obj = fact.getInstance("and");
//		OS obj = fact.getInstance("ios");
		obj.specs();
	}
}
