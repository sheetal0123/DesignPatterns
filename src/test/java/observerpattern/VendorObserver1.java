package observerpattern;

public class VendorObserver1 implements Observable, Displayable {

	private float temp;
	private float humidity;
	private float pressure;
	private Subject subject;
	
	public VendorObserver1(Subject s){
		this.subject = s;
		subject.registerObserver(this);
		//subject.removeObserver(this); // this will remove vendor from list and no display output will be displayed
	}
	

	public void update(float t, float h, float p) {
		this.temp = t;
		this.humidity = h;
		this.pressure = p;
		
		display();
	}

	/**
	 * it will show new climate data
	 */
	public void display() {
		System.out.println("Current Conditions: Temp:"+temp+", Humidity:"+humidity+", Pressure:"+pressure);
	}

}
