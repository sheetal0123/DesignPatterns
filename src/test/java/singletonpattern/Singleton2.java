package singletonpattern;

/**
 * Eagerly/reactive approach in Singleton
 * 
 * pros:
 * - as instance is initialized at the time class loads hence no question of multi threading problem
 * 
 * cons:
 * - obj is initialized well before we need it
 * - if obj is resource hungry then application may get blocked at this point of time
 */
public class Singleton2 {

	private static Singleton2 instance = new Singleton2();

	private Singleton2() {}

	public static Singleton2 getInstance() {
		return instance;
	}

}
