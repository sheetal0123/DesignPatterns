package strategypattern_1;

public class TestDuck {
	
	public static void main(String [] args){
		
		// verify white duck default behavior
		Duck whiteDuck = new WhiteDuck();
		whiteDuck.swim();
		whiteDuck.display();
		whiteDuck.performFly();
		
		//verify fat duck default behavior
		Duck fatDuck = new FatDuck();
		fatDuck.swim();
		fatDuck.display();
		fatDuck.performFly();
		
		//Dynamically changed Fat Duck behavior at run time, now Fat Duck can also fly
		Duck fatDuckNew = new FatDuck();
		fatDuckNew.setFlyBehaviour(new CanFly());
		fatDuckNew.swim();
		fatDuckNew.display();
		fatDuckNew.performFly();
	}
}
