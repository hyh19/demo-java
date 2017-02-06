package v1ch04;

/**
 * 4-4 P124
 * @author Yuhui Huang
 */
public class ParamTestX {

	public static void main(String[] args) {
		
		/*// 方法内创建了参数的副本
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("before: percent=" + percent);
		tripleValue(percent);
		System.out.println("after: percent=" + percent);
		
		// 方法内创建了参数的一个副本，指向同一个对象地址，可在方法内改变对象的状态。
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("after: salary=" + harry.getSalary());
		
		// 方法内创建了两个参数的副本，实际交换的是两个副本。
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("before: a=" + a.getName());
		System.out.println("before: b=" + b.getName());
		swap(a, b);
		System.out.println("after: a=" + a.getName());
		System.out.println("after: b=" + b.getName());*/
	}
	
	/*public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("end of method: x=" + x);
	}
	
	public static void tripleSalary(Employee employee) {
		employee.raiseSalary(200);
		System.out.println("end of method: salary=" + employee.getSalary());
	}
	
	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("end of method: x=" + x.getName());
		System.out.println("end of method: y=" + y.getName());
	}*/

}

/*class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
}*/