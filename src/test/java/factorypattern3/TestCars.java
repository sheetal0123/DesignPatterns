package factorypattern3;

import factorypattern3.FactoryCar.CarType;

public class TestCars {

	public static void main(String[] args) {
		ICar obj1 = FactoryCar.getCarType(CarType.BMW_CAR);
		System.out.println("speed: "+obj1.carMaxSpeed());
		System.out.println("horse power: "+obj1.carHorsePower());
		System.out.println("comfort: "+obj1.carComfort());
		
		
		ICar obj2 = FactoryCar.getCarType(CarType.MARUTI_CAR);
		System.out.println("speed: "+obj2.carMaxSpeed());
		System.out.println("horse power: "+obj2.carHorsePower());
		System.out.println("comfort: "+obj2.carComfort());
	}
}
