package factorypattern3;

public class CarBMW implements ICar  {

	@Override
	public int carHorsePower() {
		return 5000;
	}

	@Override
	public float carMaxSpeed() {
		return 500;
	}

	@Override
	public String carComfort() {
		return "very comfortable";
	}

}
