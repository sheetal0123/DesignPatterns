package velocitymanager;

public class PetDomain {

	String name;
	float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "PetDomain [name=" + name + ", price=" + price + "]";
	}
	
}
