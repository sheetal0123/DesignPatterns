package factorypattern2;

public class MainClass {

	public static void main(String[] args) {
		OS obj1 = new Windows();
		obj1.specs();

		OS obj2 = new Android();
		obj2.specs();

		OS obj3 = new IOS();
		obj3.specs();
	}

}
