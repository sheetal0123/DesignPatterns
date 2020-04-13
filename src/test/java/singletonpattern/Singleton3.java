package singletonpattern;

/**
 * Double checked locking approach in Singleton
 * 
 * pros:
 * - reduce the use of synchronized in getobj()
 * - handle multi threading in effective way
 * - synchronized code will be called only once
 * - increased performance
 * - volatile: The value of this variable will never be cached thread-locally: 
 *   all reads and writes will go straight to "main memory"
 * 
 * cons:
 *  no cons
 */
public class Singleton3 {

	private volatile static Singleton3 obj;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {

		if (obj == null) {

			synchronized (Singleton3.class) {

				if (obj == null) {
					obj = new Singleton3();
				}

			}
		}

		return obj;
	}

}
