package v1ch03;
import java.util.*;

/**
 * 3-3/3-4 学习 <code>while</code> 循环
 * @author Yuhui Huang
 */
public class RetirementX {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire? ");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		/*while (balance < goal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("You can retire in " + years + " years.");*/
		
		String input;
		
		do {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
			
			System.out.printf("After year %d, your balance is %,.2f%n", years, balance);
			
			System.out.print("Ready to retire? (Y/N) ");
			input = in.next();
		} while (input.equals("N"));
		
	}
}
