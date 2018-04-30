package decoratorpattern;

/**
 * All concrete decorators/addons should extend this class
 */
public abstract class Decorator extends Coffee{
	public abstract String getDescription();
}
