package v1ch05.abstractClasses;

/**
 * 5-4 P166
 * @author Yuhui Huang
 */
public class PersonTest {

	public static void main(String[] args) {

		Person[] people = new Person[2];
		
		people[0] = new Employee("Harry", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");
		
		for (Person person : people) {
			System.out.println(person.getName() + ", " + person.getDescription());
		}
	}

}
