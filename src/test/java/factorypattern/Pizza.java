package factorypattern;

/**
 * Pizza owner create this class and defined standard way to prepare, cut and
 * pack pizza
 * 
 * This is done so that franchise can use standard ways, But still they are free
 * to override and give local ways like Chicago store cutting pizza differently
 * 
 * If we want to enforce then we can make methods 'final'
 *
 * Base Pizza class define how to make a Pizza
 */
public abstract class Pizza {

	String name;

	abstract void prepare();

	public void cut() {
		System.out.println("Cutting pizza standard way ... +++");
	}

	public void box() {
		System.out.println("Packing pizza standard way ... []");

	}

	void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
