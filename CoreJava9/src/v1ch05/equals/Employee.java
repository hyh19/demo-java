package v1ch05.equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * 5-9 P178
 * @author Yuhui Huang
 */
public class Employee {
	
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		super();
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Employee other = (Employee) obj;
		
		return Objects.equals(name, other.getName()) && salary == other.getSalary() && Objects.equals(hireDay, other.getHireDay());
	}

	@Override
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}

	public static void main(String[] args) {
		Employee a = new Employee("Harry", 50000, 1999, 3, 19);
		Employee b = a;
		Employee c = new Employee("Harry", 50000, 1999, 3, 19);
		System.out.println("a equals b: " + (a==b));
		System.out.println("a equals c: " + (a==c));
		System.out.println("hashCode: " + a.hashCode());
		System.out.println("toString: " + a.toString());
	}

}
