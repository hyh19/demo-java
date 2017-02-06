package v1ch05.abstractClasses;

/**
 * 5-7 P167
 * @author Yuhui Huang
 */
public class Student extends Person {
	
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return "a student majoring in " + major;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
