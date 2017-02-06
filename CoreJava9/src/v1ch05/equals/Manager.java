package v1ch05.equals;

/**
 * 5-10 P179
 * @author Yuhui Huang
 */
public class Manager extends Employee {
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		Manager other = (Manager) obj;
		return bonus == other.bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
