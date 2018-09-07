package factorypattern3;


/**
* Here we have created Enum inside factory class
* This is better practices than other implementations
*/
public class FactoryCar {

	private static CarBMW carBMW;
	private static CarMahindra carMahindra;
	private static CarMaruti carMaruti;
	
	private FactoryCar(){
		//private constructor
	}
	
	enum CarType{
		BMW_CAR,
		MAHINDRA_CAR,
		MARUTI_CAR;
	};

	public static ICar getCarType(CarType cartype) {
		ICar iCarObj = null;

		switch (cartype) {

		case BMW_CAR:
			if (carBMW == null) {
				carBMW = new CarBMW();
			}
			iCarObj = carBMW;
			break;

		case MAHINDRA_CAR:
			if (carMahindra == null) {
				carMahindra = new CarMahindra();
			}
			iCarObj = carMahindra;
			break;

		case MARUTI_CAR:
			if (carMaruti == null) {
				carMaruti = new CarMaruti();
			}
			iCarObj = carMaruti;
			break;
		}

		return iCarObj;

	}
	
}
