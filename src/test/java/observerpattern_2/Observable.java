package observerpattern_2;

/**
 * All client observer need to implement this interface to get update from Subject source
 */
public interface Observable {
	void update(float temp, float humidity, float pressure);
}
