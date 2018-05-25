package factorypattern2;

/**
 * In factory pattern, based on some input condition we provide object of class
 * 
 * All implementation classes are derived from single Interface who's reference can be returned and used with all three classes
 *
 */
public class OSFactory {

	
	public OS getInstance(String str){

		if(str.equalsIgnoreCase("win"))	
			return new Windows();
		else if(str.equalsIgnoreCase("and"))
			return new Android();
		else if(str.equalsIgnoreCase("ios"))
			return new IOS();
		else
			throw new RuntimeException();
	}
	
}
