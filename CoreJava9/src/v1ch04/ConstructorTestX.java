package v1ch04;

import java.util.*;

/**
 * 4-5 P132 对象构造
 * @author Yuhui Huang
 */
public class ConstructorTestX {

	public static void main(String[] args) {

		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry", 40000);
		staff[1] =  new Employee(60000);
		staff[2] = new Employee();
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",id=" + employee.getId() + ",salary=" + employee.getSalary());
		}
	}

}

class Employee {
	
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	// 静态初始化快，初始化静态域，第一次加载类的时候调用。
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	// 初始化块，每次构造对象的时候调用。
	{
		id = nextId;
		nextId++;
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee(double salary) {
		// 在C++中，一个构造器不能调用另一个构造器。
		this("Employee #" + nextId, salary);
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
}