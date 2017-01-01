package observerpattern;

/**
 * Class which collect data i.e. source class need to implement this interface
 */
public interface Subject {
	void registerObserver(Observable o);
	void removeObserver(Observable o);
	void notifyObserver();
}
