package factorypattern3;

public class CarMaruti implements ICar  {

	@Override
	public int carHorsePower() {
		return 1000;
	}

	@Override
	public float carMaxSpeed() {
		return 100;
	}

	@Override
	public String carComfort() {
		return "comfortable";
	}

}
