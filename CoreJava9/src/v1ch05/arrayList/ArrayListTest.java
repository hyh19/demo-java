package v1ch05.arrayList;

import java.util.ArrayList;
import v1ch05.inheritance.Employee;

/**
 * 5-11 P185
 * @author Yuhui Huang
 */
public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
		
		for (Employee employee : staff) {
			employee.raiseSalary(5);
		}
		
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary() + ",hireDay=" + employee.getHireDay());
		}

	}

}
