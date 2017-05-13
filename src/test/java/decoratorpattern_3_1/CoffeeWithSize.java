package decoratorpattern_3_1;


/**
 * Here we have introduced a new feature
 * 
 * Coffee cost will remain same for small, medium and large
 * But addon cost will vary based of coffee size
 * 
 */
public abstract class CoffeeWithSize {
	
	//enum of size
	public enum Size {LARGE, MEDIUM, SMALL}
	Size size= Size.LARGE;
	
	
	//old code
	String description = "unknow cofee type";
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
	
	//getter setters
	public void setSize(Size s){
		this.size = s;
	}
	
	public Size getSize(){
		return this.size;
	}
	
}

