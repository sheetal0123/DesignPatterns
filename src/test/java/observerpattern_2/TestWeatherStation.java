package observerpattern_2;

public class TestWeatherStation {

	public static void main(String[] args) {
		/**
		 * Array List get initialized
		 */
		WeatherData weatherData = new WeatherData();
		
		/**
		 * It will register VendorObserver1 class as observer
		 */
		VendorObserver1 vendorObserver1 = new VendorObserver1(weatherData); 
		
		/**
		 * It will trigger WeatherData's set method i.e. condition changed
		 */
		weatherData.setMeasurement(100, 50, 30);
		weatherData.setMeasurement(1000, 500, 300);
	}
}
