package factorypattern3;

public class CarMahindra implements ICar  {

	@Override
	public int carHorsePower() {
		return 3000;
	}

	@Override
	public float carMaxSpeed() {
		return 300;
	}

	@Override
	public String carComfort() {
		return "not much comfortable";
	}

}
