package singletonpattern;

/**
 * Basic approach in Singleton
 * 
 * pros:
 * - private constructor : no other class can use new Singleton1()
 * - synchronized getInstance() : two thread cannot enter at same time
 * - simple to use, if getInstance is not a blocker for app then complete method can be made synchronized
 * - using lazy loading concept, when we call getInstance, only then obj get created
 * 
 * cons:
 * - complete method has been synchronized
 * - we need to synchronize getInstance only for first time, once obj get initialize 
 * 		then if() will take care that no thread enter into it
 *
 */
public class Singleton1 {

	private static Singleton1 instance;

	private Singleton1() {}

	public synchronized static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

}
