package v1ch05.abstractClasses;

/**
 * 5-5 P166
 * @author Yuhui Huang
 */
public abstract class Person {
	
	public abstract String getDescription();
	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}

	
