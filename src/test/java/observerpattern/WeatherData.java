package observerpattern;

import java.util.ArrayList;

/**
 * Req:
 * WeatherData class collects real data regarding climate temp, pressure and humidity
 * As soon as data changes WeatherData will PUSH/Notify Observers, who then further display the data reading to public
 *
 * Any new vendor can request for observer
 * Any observer can request to remove itself from observer list
 * As soon as new data received, WeatherData class will update all Observers, so its a PUSH approach
 */
public class WeatherData implements Subject {

	private ArrayList<Observable> observer;
	private float temp;
	private float humidity;
	private float pressure;

	
	public WeatherData(){
		observer = new ArrayList<Observable>();
	}
	
	/**
	 * Accept object of all classes which implement Observable interface
	 */
	public void registerObserver(Observable o) {
		observer.add(o);
	}

	/**
	 * Accept object of all classes which implement Observable interface
	 */
	public void removeObserver(Observable o) {
		int i = observer.indexOf(o);
		
		if(i>=0)
			observer.remove(i);
	}

	/**
	 * This will notify every observer present in array list
	 */
	public void notifyObserver() {
		for(Observable obs: observer){
			obs.update(temp, humidity, pressure);
		}
	}

	/**
	 * This will call notifyObserver method
	 */
	public void measurementChanged(){
		notifyObserver();
	}

	
	/**
	 * As soon as WeatherStation finds new climate change, this method will be invoked
	 * It set new data and call measurementChanged method
	 */
	public void setMeasurement(float t, float h, float p){
		this.temp = t;
		this.humidity = h;
		this.pressure = p;
		
		measurementChanged();
	}

	
	
	
	

}
