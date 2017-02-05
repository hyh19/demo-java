package v1ch04;

/**
 * 4-3 P119
 * @author Yuhui Huang
 */
public class StaticTestX {

	public static void main(String[] args) {

		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Ken", 40000);
		staff[1] = new Employee("Mike", 60000);
		staff[2] = new Employee("Jim", 65000);
		
		for (Employee employee : staff) {
			employee.setId();
			System.out.println("name=" + employee.getName() + ",id=" + employee.getId() + ".salary=" + employee.getSalary());
		}

	}

}

class Employee {
	
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = nextId;
		nextId++;
	}

	public static int getNextId() {
		return nextId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
}